package com.best.IT.jobs.Upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.best.IT.jobs.utility.JDBCDataSource;


@WebServlet("/UploadImage")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)
public class UploadImage extends HttpServlet {

	private String getFileName(final Part part) {
		final String partHeader = part.getHeader("content-disposition");

		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
			}
		}
		return null;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out1 = response.getWriter()) {
			HttpSession session = request.getSession();
		//	String name = request.getParameter("unname");
			Part filePart = request.getPart("photo");

			String photo = "";
			String path = "D:\\uploaded_files\\";

			File file = new File(path);
			file.mkdir();
			String fileName = getFileName(filePart);

			OutputStream out = null;

			InputStream filecontent = null;

			PrintWriter writer = response.getWriter();
			try {
				out = new FileOutputStream(new File(path + File.separator + fileName));

				filecontent = filePart.getInputStream();

				int read = 0;
				final byte[] bytes = new byte[1024];

				while ((read = filecontent.read(bytes)) != -1) {
					out.write(bytes, 0, read);

					photo = path + "/" + fileName;

				}

				Connection con = JDBCDataSource.getConnection();
				Statement stmt = con.createStatement();

				//stmt.executeUpdate("update userProfil";
						

			} catch (Exception e) {

			}
			out1.println(
					"<html><body><script>alert('Sucessfully Saved! Check the database and the path!');</script></body></html>");
		}
	}
}