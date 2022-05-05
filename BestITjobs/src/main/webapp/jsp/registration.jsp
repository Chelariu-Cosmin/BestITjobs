<%@page import="com.best.IT.jobs.utility.ServletUtility"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
<%@ include file="/jsp/header.jsp"%>
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
	$(function() {
		$("#datepicker").datepicker({
			dateFormat : 'mm/dd/yy',
			changeMonth : true,
			changeYear : true
		});
	});
</script>
</head>
<body>

	<main class="login-form">
		<div class="cotainer">
			<div class="row justify-content-center">
				<div class="col-md-8">
					<ul>
					</ul>

					<div class="card">
						<div class="card-header">Inregistrare</div>
						<%=ServletUtility.getSuccessMessage(request)%>
						<%=ServletUtility.getErrorMessage(request)%>

						<div class="card-body">
							<form action="/BestITjobs/RegistrationCTL" method="post">

								<input type="hidden" name="uri" value=""> <input
									type="hidden" name="id" value=""> <input type="hidden"
									name="createdBy" value=""> <input type="hidden"
									name="modifiedBy" value=""> <input type="hidden"
									name="createdDatetime" value=""> <input type="hidden"
									name="modifiedDatetime" value="">

								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">Prenume<font color="red"></font>
									</label>
									<div class="col-md-6">
										<input type="text" class="form-control"
											placeholder="Enter First Name" name="firstName" value="">
										<font color="red"></font>
									</div>
								</div>

								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">
										Nume<font color="red"></font>
									</label>
									<div class="col-md-6">
										<input type="text" class="form-control"
											placeholder="Enter Last Name" name="lastName" value="">
										<font color="red"></font>
									</div>
								</div>

								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">Nume utilizator<font color="red"></font>
									</label>
									<div class="col-md-6">
										<input type="text" id="email_address" class="form-control"
											placeholder="Enter your userName" name="userName" value="">
										<font color="red"></font>
									</div>
								</div>


								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">Parola<font
										color="red"></font></label>
									<div class="col-md-6">
										<input type="password" id="email_address" class="form-control"
											placeholder="Enter password" name="password" value="">
										<font color="red"></font>
									</div>
								</div>


								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">Data nasterii<font color="red"></font>
									</label>
									<div class="col-md-6">
										<input type="text" id="datepicker" class="form-control"
											placeholder="Enter Date Of Birth" name="dateOfBirth" value="">
										<font color="red"></font>
									</div>
								</div>


								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">Email<font
										color="red"></font></label>
									<div class="col-md-6">
										<input type="text" id="email_address" class="form-control"
											placeholder="Enter your email" name="email" value="">
										<font color="red"></font>
									</div>
								</div>
								<div class="col-md-6 offset-md-4">
									<input type="submit" class="btn btn-primary" name="operation"
										value="Register">

								</div>
							</form>
						</div>

					</div>
				</div>
			</div>
		</div>
	</main>
	<div style="margin-top: 120px"></div>
</body>
<%@ include file="footer.jsp"%>
</html>