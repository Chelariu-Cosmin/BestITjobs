package com.best.IT.jobs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.best.IT.jobs.hibernate.User;
import com.best.IT.jobs.hibernate.UserProfil;
import com.best.IT.jobs.repository.RoleRepository;
import com.best.IT.jobs.repository.UserRepository;
import com.best.IT.jobs.utility.DataUtility;
import com.best.IT.jobs.utility.ServletUtility;

/**
 * Servlet implementation class RegistrationCTL
 */
@WebServlet(name = "RegistrationCTL", urlPatterns = { "/RegistrationCTL" })
public class RegistrationCTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static RoleRepository roleRepository;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationCTL() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		// ServletUtility.forward("jsp/registration.jsp", request, response);
		request.getRequestDispatcher("jsp/registration.jsp").forward(request, response);
		// response.sendRedirect("jsp/registration.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		user.setFirstName(request.getParameter("firstName"));
		user.setLastName(request.getParameter("lastName"));
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		user.setDateOfBirth(DataUtility.getDate(request.getParameter("dateOfBirth")));
		user.setEmail(request.getParameter("email"));
		user.setRolId(roleRepository.findByRol("user").getId());
		long i = UserRepository.addUser(user);
		if (i > 0) {
			ServletUtility.setSuccessMessage("User register sucessfully", request);

		} else {
			ServletUtility.setErrorMessage("Not inserted", request);
		}

		request.getRequestDispatcher("jsp/registration.jsp").forward(request, response);
	}
}