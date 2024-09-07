<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</link>
<!-- Bootstrap CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
	rel="stylesheet">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/login.css"></link>
</head>

<body>

	<div
		class="container mb-2 position-absolute top-50 start-50 translate-middle p-3 mb-5 text-dark shadow-lg rounded">

		<p class="fw-bolder fs-2 text-center">Restaurant Login</p>

		<div class="container m-2">

			<form class="row g-3" action="checkInDatabase" method="post">

				<div class="col-md-12 mt-3 p-2">
					<label for="uemail" class="form-label">Username</label>
					<div class="input-group has-validation">
						<input type="email" class="form-control def" id="uemail"
							name="username" style="border-radius: 10px;" required>
						<div class="invalid-feedback">Please enter a valid username.
						</div>
						<div class="valid-feedback">Looks Good!</div>
					</div>
				</div>


				<div class="col-md-12 mt-3 p-2">
					<label for="upass" class="form-label">Password</label> <input
						type="password" class="form-control def" id="upass"
						name="userpassword" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Enter a valid Password!</div>
				</div>

				<div class="col-12">
					<div class="form-check">
						<input class="form-check-input def" type="checkbox" value=""
							id="agree" required> <label class="form-check-label"
							for="invalidCheck3"> Agree to terms and conditions </label>
					</div>
				</div>
				<c:if test="${not empty errorMessage}">
					<div class="alert alert-danger" role="alert">${errorMessage}
					</div>
				</c:if>

				<div class="col-12 mt-4">
					<input type="submit" class="btn btn-danger disabled" id="login"
						value="Login">
					

					<a href="register.html">New Restaurant???Register Here</a>
				</div>

			</form>

		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
</body>

</html>