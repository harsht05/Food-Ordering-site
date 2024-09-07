<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"></link>
	 <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body style="background-color:#ffc3a149;">

	<div class="container mb-2 position-absolute top-50 start-50 translate-middle p-3 mb-5 text-dark shadow-lg rounded">
 <!-- Error message display section -->
        <c:if test="${not empty errorMessage}">
            <div class="alert alert-danger" role="alert">
                ${errorMessage}
            </div>
        </c:if>
		<p class="fw-bolder fs-2 text-center">Login</p>

		<div class="container m-2" >

			<form class="row g-3" action="loginRequest" method="post">

				<div class="col-md-12 mt-3 p-2">
					<label for="uemail" class="form-label">Email</label>
					<div class="input-group has-validation">
						<input type="email" class="form-control def" id="uemail"
							name="email" style="border-radius: 25px;" required>
						<div class="invalid-feedback">Please enter a valid username.
						</div>
						<div class="valid-feedback">Looks Good!</div>
					</div>
				</div>

				<div class="col-md-12 mt-3 p-2">
					<label for="upass" class="form-label">Password</label> <input
						type="password" class="form-control def" id="upass" name="pass"
						required>
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

				<div class="col-12 mt-4">
					<input type="submit" class="btn btn-danger disabled" id="login"
						value="Login">
					</button>
				</div>

			</form>

		</div>

		<div class="d-flex justify-content-between align-items-center mt-3 p-2">
			<div>
				<p class="text-dark mb-2">
					<a href="forgotPasswordRequest" class="text-decoration-none">Forgot
						Password?</a>
				</p>
				<p class="text-dark mb-2">
					<a href="customerRegisterRequest" class="text-decoration-none">Register
						as a Customer</a>
				</p>
				<p class="text-dark">
					<a href="RestaurantRegisterRequest" class="text-decoration-none">Register
						as a Restaurant Owner</a>
				</p>
			</div>
			<div>
				<a class="navbar-brand" href="#"> <img
						src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
						alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
				</a>
			</div>
		</div>

	</div>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
</body>
</html>
