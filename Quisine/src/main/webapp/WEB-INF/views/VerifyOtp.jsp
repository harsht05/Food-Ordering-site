<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Verify OTP</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body style="background-color: #ffc3a149">

	<div
		class="container mb-2 position-absolute top-50 start-50 translate-middle p-3 mb-5 text-dark shadow-lg rounded">

		
		<p class="fw-bolder fs-2 text-center">Verify OTP</p>

		<div class="container m-2">

			<form class="row g-3" action="verifyOtp" method="post">

				<div class="col-md-12 mt-3 p-2">
					<label for="uemail" class="form-label">Email</label>
					<div class="input-group has-validation">
						<input type="email" class="form-control def" id="cust_email"
							name="cust_email" value="${cust_email }"
							style="border-radius: 20px;" readonly>
						<div class="invalid-feedback">Please enter a valid username.
						</div>
						<div class="valid-feedback">Looks Good!</div>
					</div>
				</div>

				<div class="col-md-12 mt-3 p-2">
					<label for="otp" class="form-label">Enter OTP</label>
					<div class="input-group has-validation">
						<input type="password" class="form-control def" id="otp"
							name="otpw" style="border-radius: 20px;" required>
						<div class="invalid-feedback">Please enter a valid OTP.</div>
						<div class="valid-feedback">Looks Good!</div>
					</div>
				</div>

				<input type="hidden" name="otp" value="${otp }">

				<div class="col-12">
					<div class="form-check">
						<input class="form-check-input def" type="checkbox" value=""
							id="agree" required> <label class="form-check-label"
							for="invalidCheck3"> Agree to terms and conditions </label>
					</div>
				</div>

				<div class="col-12 mt-4">
					<input type="submit" class="btn btn-danger" id="login"
						value="Verify OTP">
				</div>

			</form>

		</div>

		<div class="position-fixed bottom-0 end-0 p-3">
			<a class="navbar-brand" href="#"> <img
				src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
				alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
			</a>
		</div>

	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/otp.js"></script>
</body>
</html>
