<%@page import="com.best.IT.jobs.utility.ServletUtility"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@ include file="header.jsp"%>
<link rel="stylesheet" href="../css/style.css">
<body>

	<main class="login-form">
		<div class="cotainer">
			<div class="row justify-content-center">
				<div class="col-md-8">
					<br> <br> <br>

					<div class="card">
						<div class="card-header">
						Conectare
							<h6 style="color: red;"><%=ServletUtility.getErrorMessage(request)%></h6>
							<h6 style="color: green;"></h6>
						</div>
						<div class="card-body">
							<form action="/BestITjobs/LoginCTL" method="post"
								autocomplete="off">
								<div class="form-group row">
									<label for="email_address"
										class="col-md-4 col-form-label text-md-right">Nume utilizator<font
										color="red">*</font></label>
									<div class="col-md-6">
										<input type="text" id="login" class="form-control"
											placeholder="Enter your userName" name="userName" value="">
										<font color="red"></font>
									</div>
								</div>
								<div class="form-group row">
									<label for="password"
										class="col-md-4 col-form-label text-md-right">Parola<font
										color="red">*</font></label>
									<div class="col-md-6">
										<input type="password" id="password" class="form-control"
											placeholder="Enter Password" name="password" value="">
										<font color="red"> </font>
									</div>
								</div>

								
								<div class="col-md-6 offset-md-4">
									<input type="submit" class="btn btn-primary" name="operation"
										value="Login"> <a href="" class="btn btn-link">
										Ati uitat parola? </a>
								</div>
							</form>
						</div>
					</div>
				</div>
				<br> <br> <br>

			</div>
		</div>
	</main>
	<div style="margin-top: 240px"></div>
</body>
<%@ include file="footer.jsp"%>
</html>