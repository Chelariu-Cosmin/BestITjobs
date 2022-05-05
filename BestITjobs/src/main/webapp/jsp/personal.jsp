
<%@page import="com.best.IT.jobs.utility.ServletUtility"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<head>
<title>Pagina personala</title>
<meta charset="utf-8">
<meta name="viewport" content="width=divice-width,initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="/BestITjobs/css/personal.css">
<link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js">
<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">
<link rel="stylesheet" href="/BestITjobs/css/style.css">
<link rel="stylesheet" href="/BestITjobs/css/uploadImage.css">
<style>
textarea {
	width: 100%;
	height: 150px;
	padding: 12px 20px;
	box-sizing: border-box;
	border: 2px solid #ccc;
	border-radius: 4px;
	background-color: #f8f8f8;
	font-size: 16px;
	resize: none;
	border-radius: 4px;
}
</style>


<%@ include file="header.jsp"%>
</head>

<body>
	<%--comment jsp --%>

	<h3 style="color: green;"><%=ServletUtility.getSuccessMessage(request)%></h3>

	<%--ANOTHER --%>
	<div class="container rounded bg-white mt-1 mb-7 ml-5">
		<div class="row">
			<div class="col-md-3">
				<div
					class="d-flex flex-column align-items-center text-center p-2 py-0">
					<form action="/BestITjobs/UploadImage" method="post"
						enctype="multipart/form-data">
						<div class="avatar-upload">
							<span class="font-weight-bold"><%=session.getAttribute("user")%></span>
							<div class="avatar-edit">
								<input type='file' id="imageUpload" accept=".png, .jpg, .jpeg"
									name="photo" /> <label for="imageUpload"></label>
							</div>
							<div class="avatar-preview">
								<div id="imagePreview">
									<a href="image"><img class="img-profil" src="" alt=""></a>
								</div>
								<div class="mt-2">
									<button class="btn btn-primary profile-button" type="submit">Salveaza</button>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>

			<div class="col-md-5 ">
				<div class="p-3 py-5">
					<div class="d-flex justify-content-between align-items-center mb-3">
						<h4 class="text-right">Optiuni profil</h4>
					</div>
					<div class="row mt-2">
						<div class="col-md-6">
							<label class="labels">Nume</label><input type="text"
								class="form-control" placeholder="Nume" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">Prenume</label><input type="text"
								class="form-control" value="" placeholder="Prenume">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Telefon</label><input type="text"
								class="form-control" placeholder="Numarul de telefon" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">E-mail</label><input type="text"
								class="form-control" placeholder="Adresa de email" value="">
						</div>
					</div>

					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Strada</label><input type="text"
								class="form-control" placeholder="Strada" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">Localitate</label><input type="text"
								class="form-control" placeholder="Localitate" value="">
						</div>
					</div>

					<div class="row mt-3">

						<div class="col-md-6">
							<label class="labels">cod Postal</label><input type="text"
								class="form-control" placeholder="Cod Postal" value="">
						</div>


						<div class="col-md-6">
							<label class="labels">Judet</label><input type="text"
								class="form-control" placeholder="Judet" value="">

						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Tara</label><input type="text"
								class="form-control" placeholder="Tara" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">Studii</label><input type="text"
								class="form-control" placeholder="Nivelul de studii finalizat"
								value="">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Facultate</label><input type="text"
								class="form-control" placeholder="Denumire Facultate" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">Pozitie ocupata</label><input type="text"
								class="form-control" placeholder="Pozitie ocupata" value="">
						</div>
					</div>
					<div class="row mt-3">
						<div class="col-md-6">
							<label class="labels">Data inceput</label><input type="text"
								class="form-control" placeholder="Data inceput" value="">
						</div>
						<div class="col-md-6">
							<label class="labels">Data sfarsit</label><input type="text"
								class="form-control" placeholder="Data sfarsit" value="">
						</div>
					</div>
					<div class="mt-5 text-center">
						<button class="btn btn-primary profile-button" type="button">Salveaza</button>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="p-3 py-5">
					<form action="/BestITjobs/FileUploadHandler" method="post"
						enctype="multipart/form-data">
						<div
							class="max-w-md mx-auto bg-white rounded-lg overflow-hidden md:max-w-lg">
							<div class="md:flex">
								<div class="w-full">
									<div class="p-4 border-b-2">
										<span class="text-lg font-bold text-gray-600">Adauga
											CV, Scrisoare de intentie, Certificari, etc.</span>
									</div>
									<div class="p-3">
										<div class="mb-2">
											<span>Atasamente</span>
											<div
												class="relative h-40 rounded-lg border-dashed border-2 border-gray-200 bg-white flex justify-center items-center hover:cursor-pointer">
												<div class="absolute">
													<div class="flex flex-col items-center ">
														<i class="fa fa-cloud-upload fa-3x text-gray-200"></i> <span
															class="block text-gray-400 font-normal">Atasati
															documentele aici!</span> <span
															class="block text-gray-400 font-normal">or</span> <span
															class="block text-blue-400 font-normal">Cauta
															fisiere</span>

													</div>
												</div>

												<input type="file" id=uploadFiles
													class="h-full w-full opacity-0" name="docs" multiple>
											</div>
											<div class="flex justify-between items-center text-gray-400">
												<span>Tipul de fisier acceptat:.doc only</span> <span
													class="flex items-center "><i
													class="fa fa-lock mr-1"></i> securizat</span>
											</div>
										</div>
									</div>
									<div class="mt-2 text-center">
										<button class="btn btn-primary profile-button" type="button">Salveaza</button>
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


	<form>
		<h5>Spune ceva despre tine!</h5>
		<div class="form-outline w-50 mb-4">
			<textarea class="form-control" id="textAreaExample1" rows="4"></textarea>
			<label class="form-label" for="textAreaExample"></label>
			<div class="mt-2 text-center">
				<button class="btn btn-primary profile-button" type="button">Salveaza</button>
			</div>
		</div>
	</form>
	<br>
	<%@ include file="footer.jsp"%>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="/BestITjobs/scripts/upload.js"></script>
	<script type="text/javascript">
		function readURL(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();
				reader.onload = function(e) {
					$('#imagePreview').css('background-image',
							'url(' + e.target.result + ')');
					$('#imagePreview').hide();
					$('#imagePreview').fadeIn(650);
				}
				reader.readAsDataURL(input.files[0]);
			}
		}
		$("#imageUpload").change(function() {
			readURL(this);
		});

		$("#uploadFiles").change(function() {
			var data = document.createElement("INPUT");
			data.setAttribute("type", "file");
			document.body.appendChild(data);
		});
	<%//ANOTHER//%>
		function drop(e) {
			e.stopPropagation();
			e.preventDefault();

			const dt = e.dataTransfer;
			const files = dt.files;

			handleFiles(files);
		}

		function handleFiles(files) {
			for (let i = 0; i < files.length; i++) {
				const file = files[i];
				const doc = document.createElement("doc");
				doc.classList.add("obj");
				doc.file = file;
				preview.appendChild(doc); // Assuming that "preview" is the div output where the content will be displayed.

				const reader = new FileReader();
				reader.onload = (function(aDoc) {
					return function(e) {
						aDoc.src = e.target.result;
					};
				})(doc);
				reader.readAsDataURL(file);
			}
		}
	</script>



</body>
</html>