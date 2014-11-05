
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
<title>Upload File</title>
</head>
<body>


	<section>
		<nav>
			<ul>
				<li><a href="edit_subtitle">Traduction</a></li>
				<li><a href="upload">Upload</a></li>
				<li><a href="download">Download</a></li>
			</ul>
		</nav>



		<form action="POST" onsubmit="upload"
			enctype="application/x-www-form-urlencoded">
			<div>
				<p>Veuilliez choisir le fichier à enregistrer</p>
			</div>
			<div>
				<input type="file" accept="srt"> <input type="submit" />
			</div>

		</form>

	</section>

</body>
</html>