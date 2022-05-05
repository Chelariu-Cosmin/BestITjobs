package com.best.IT.jobs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.best.IT.jobs.exceptions.InvalidPassException;
import com.best.IT.jobs.hibernate.User;
import com.best.IT.jobs.repository.UserRepository;
import com.best.IT.jobs.utility.DataUtility;
import com.best.IT.jobs.utility.ServletUtility;

/**
 * Servlet implementation class LoginCTL
 */
@WebServlet(name = "LoginCTL", urlPatterns = { "/LoginCTL" })
public class LoginCTL extends HttpServlet {

	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginCTL() {
		super();

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op = DataUtility.getString(request.getParameter("operation"));
		HttpSession session = request.getSession(false);
		if ("logout".equalsIgnoreCase(op)) {
			session.invalidate();
			ServletUtility.setSuccessMessage("LogoutSucessfully", request);

		}
		ServletUtility.forward("jsp/login.jsp", request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			User user = new User();
			String userName = request.getParameter("userName");
			String pwd = request.getParameter("password");

			HttpSession session = request.getSession(true);
			user = UserRepository.UserLogin(userName, pwd);
			if (user != null) {
				session.setAttribute("user", user.getUserName());
				ServletUtility.redirect("jsp/personal.jsp", request, response);
			} else {
				ServletUtility.setErrorMessage("Username-ul nu sunt asociate unui cont.", request);
				ServletUtility.forward("jsp/login.jsp", request, response);
			}
		} catch (InvalidPassException e) {
			ServletUtility.setErrorMessage(e.getMessage(), request);
			ServletUtility.forward("jsp/login.jsp", request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
