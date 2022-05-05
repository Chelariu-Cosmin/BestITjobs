<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="fr"
	xmlns:th="http://www.thymeleaf.org">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Office">
<meta name="author" content="A.K.">


<title>Locuri de munca</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Fonts -->
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Bree+Serif"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Mukta"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Crimson+Text"
	rel="stylesheet">
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.6.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="css/style.css">
<!-- caduri -->
<link rel="stylesheet" type="text/css" href="css/carduri.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/../css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/../js/bootstrap.bundle.min.js">
<link href="https://use.fontawesome.com/releases/v5.7.2/css/all.css">


</head>
<div id="preloder"></div>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">

	<header>
		<div class="header-full">
			<nav class="navbar navbar-default">


				<div class="container">
					<a href="/login"><img class="img-responsive logo-ITjobs"
						src="image/logo1.jpg" alt="logo-ITjobs" align="left"></a>

					<div class="navbar-header nav-inline">
						<ul class="nav navbar-nav navbar-right">
							<li>
								<div class="menu-icon">
									<a href="#"> <span class="icon-bars"></span>
									</a>
									<div class="icon-bar1"></div>
									<div class="icon-bar2"></div>
									<div class="icon-bar3"></div>
								</div>
							</li>

							<%
							if (session.getAttribute("user") == null) {
							%>
							<li><a href="/BestITjobs/jsp/login.jsp">Conectare</a></li>
							<%
							}
							%>
							<!-- With user -->
							<%
							if (session.getAttribute("user") != null) {
							%>
							<li class="nav navbar-nav navbar-right"><a
								class="/BestITjobs/jsp/login.jsp"><%=session.getAttribute("user")%></a></li>
							<%
							}
							%>

						</ul>
					</div>
				</div>
			</nav>

			<div class="welcome-header">
				<h1>Bine ati venit pe BestITjobs!</h1>
				<p>Daca vrei sa te angajezi in domeniul IT. Platforma BestITjobs
					iti ofera toate oportunitatile si locurile disponibile in cadrul
					multinationalei BestIT .</p>

			</div>
			<div id="myNav" class="overlay">
				<div class="overlay-content">
					<a href="/BestITjobs/jsp/index.jsp">Anunturi</a> 
					<a href="/BestITjobs/jsp/personal.jsp">Profil</a>
					<%					
					if (session.getAttribute("user") == null) {
					%>
					<li><a href="/BestITjobs/jsp/registration.jsp">Inregistrare</a></li>
					<%
					}
					%>
					<!-- With user -->
					<%
					if (session.getAttribute("user") != null) {
					%>
					<a class=""></a>
					<%
					}
					%>
				</div>
				
			</div>
		</div>
	</header>

	<section class="bg-section" id="blog">

		<div class="col-lg-12">
			<ul class="breadcrumb">
				<li><a href="/BestITjobs/index.jsp">Anunturi</a></li>
				<li><a href="/BestITjobs/jsp/personal.jsp">Profil</a></li>

				<%
				if (session.getAttribute("user") == null) {
				%>
				<li><a href="/BestITjobs/jsp/registration.jsp">Inregistrare</a></li>
				<%
				}
				%>
				<!-- With user -->
				<%
				if (session.getAttribute("user") != null) {
				%>
				<li class="breadcrumb"><a
					class="/BestITjobs/jsp/registration.jsp"></a></li>
				<%
				}
				%>
			</ul>
		</div>
		<div class="section-h1">
			<h1>Anunturi disponibile</h1>
			<hr class="hr-h1">
		</div>


		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-6 col-sm-6">
					<div class="category mb-30">
						<div class="job">
							<span class="colors1 mb-4">Programming &amp; IT</span>
							<h5>
								<a href="#">Software developer - Internship</a>
							</h5>
							<ul class="place">
								<li>
									<p>
										<i class="fas fa-map-marker-alt pe-2"></i> Iasi, Romania
									</p>
								</li>
								<li>
									<p class="ps-5">
										<i class="fas fa-map-marker-alt pe-2"></i>Full Time
									</p>
								</li>
							</ul>
							<div class="d-flex align-items-center justify-content-between">
								<div class="left">
									<p>BestITjobs</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<div class="category mb-30">
						<div class="job">
							<span class="colors2 mb-4">Programming &amp; IT</span>
							<h5>
								<a href="#">Software developer - Senior</a>
							</h5>
							<ul class="place">
								<li>
									<p>
										<i class="fas fa-map-marker-alt pe-2"></i> Bucuresti, Romania
									</p>
								</li>
								<li>
									<p class="ps-5">
										<i class="fas fa-map-marker-alt pe-2"></i>Full Time
									</p>
								</li>
							</ul>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="left">
									<p>BestITjobs</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<div class="category mb-30">
						<div class="job">
							<span class="colors3 mb-4">Programming &amp; IT</span>
							<h5>
								<a href="#">Junior Java Developer</a>
							</h5>
							<ul class="place">
								<li>
									<p>
										<i class="fas fa-map-marker-alt pe-2"></i> Bucuresti, Romania
									</p>
								</li>
								<li>
									<p class="ps-5">
										<i class="fas fa-map-marker-alt pe-2"></i>Full Time
									</p>
								</li>
							</ul>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="left">
									<p>BestITjobs</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<div class="category mb-30">
						<div class="job">
							<span class="colors4 mb-4">Programming &amp; IT</span>
							<h5>
								<a href="#">Senior Java Developer REMOTE</a>
							</h5>
							<ul class="place">
								<li>
									<p>
										<i class="fas fa-map-marker-alt pe-2"></i> Iasi, Romania
									</p>
								</li>
								<li>
									<p class="ps-5">
										<i class="fas fa-map-marker-alt pe-2"></i>Full Time
									</p>
								</li>
							</ul>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="left">
									<p>BestITjobs</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<div class="category mb-30">
						<div class="job">
							<span class="colors5 mb-4">Programming &amp; IT</span>
							<h5>
								<a href="#">Software Engineer for BSA</a>
							</h5>
							<ul class="place">
								<li>
									<p>
										<i class="fas fa-map-marker-alt pe-2"></i> Iasi,Romania
									</p>
								</li>
								<li>
									<p class="ps-5">
										<i class="fas fa-map-marker-alt pe-2"></i>Full Time
									</p>
								</li>
							</ul>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="left">
									<p>BestITjobs</p>
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6 col-sm-6">
					<div class="category mb-30">
						<div class="job">
							<span class="colors2 mb-4">Programming &amp; IT</span>
							<h5>
								<a href="#">Master Data Analyst</a>
							</h5>
							<ul class="place">
								<li>
									<p>
										<i class="fas fa-map-marker-alt pe-2"></i> Cluj Napoca,
										Romania
									</p>
								</li>
								<li>
									<p class="ps-5">
										<i class="fas fa-map-marker-alt pe-2"></i>Full Time
									</p>
								</li>
							</ul>
							<div
								class="pricing d-flex justify-content-between align-items-center">
								<div class="left">
									<p>BestITjobs</p>
								</div>

							</div>
						</div>
					</div>
				</div>
				<div class="col-12 d-flex align-items-center justify-content-center">
					<div class="btn btn-primary mb-30">
						<span>Mai multe anunturi</span> <span class="fas fa-arrow-right"></span>
					</div>
				</div>
			</div>
		</div>

		<!-- //joburi -->

	</section>

	<div class="loader">
		<img src="/BestITjobs/image/loading.gif" alt="Loading..." />
	</div>
	<script type="text/javascript">
		window.addEventListener("load", function() {
			const loader = document.querySelector(".loader");
			loader.className += "  hidden"; // class "loader hidden"
		});
	</script>

	<script type="text/javascript" src="/BestITjobs/scripts/scripts.js"></script>

	<a class="to-top" href="#myPage" title="toTop"> <i
		class="fa fa-chevron-up"></i>
	</a>
</body>
<%@ include file="jsp/footer.jsp"%>
</html>

