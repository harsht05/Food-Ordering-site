<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"></link>
<!-- Bootstrap CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/register.css">



</head>
<body style="background-color:#ffc3a149;">
	<div
		class="container position-absolute top-50 start-50 translate-middle p-2 mb-5 text-dark shadow-lg rounded">

		<p class="fw-bolder fs-2 text-center">Register</p>

		<div class="container">

			<form class="row g-3" action="registerCustomer" method="post">

				<div class="col-md-6">
					<label for="fname" class="form-label">First name</label> <input
						type="text" class="form-control def" id="fname" name="custName"
						placeholder="Enter your first name" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Enter a valid name!</div>
				</div>

				<div class="col-md-6">
					<label for="lname" class="form-label">Last name</label> <input
						type="text" class="form-control def" id="lname"
						placeholder="Optional...">
				</div>

				<div class="col-md-6">
					<label for="uemail" class="form-label">Email</label>
					<div class="input-group has-validation">
						<input type="email" class="form-control def" id="uemail"
							name="custEmail" placeholder="Enter your email id"
							style="border-radius: 20px;" value="${email}" readonly>
						<div class="invalid-feedback">Please choose a username.</div>
						<div class="valid-feedback">Looks Good!</div>
					</div>
				</div>

				<div class="col-md-6">
					<label for="cnumber" class="form-label">Contact Number</label> <input
						type="text" class="form-control def" id="cnumber"
						name="custContact" placeholder="Enter your contact number"
						required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Enter a valid mobile number!</div>
				</div>

				<div class="col-md-6">
					<label for="upass" class="form-label">Password</label> <input
						type="password" class="form-control def" id="upass"
						name="custPass" placeholder="Choose a strong password" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Weak Password!</div>
				</div>

				<div class="col-md-6">
					<label for="upassc" class="form-label">Confirm Password</label> <input
						type="password" class="form-control def" id="upassc"
						placeholder="Confirm your password" required>
					<div class="valid-feedback">Password matched successfully!</div>
					<div class="invalid-feedback">Password not match!</div>
				</div>

				<div class="col-md-6">
					<label for="city" class="form-label">City</label> <input
						type="text" class="form-control def" id="city" name="custCity"
						placeholder="Enter your city" required>
					<div class="invalid-feedback">Please provide a valid city.</div>
					<div class="valid-feedback">Looks good!</div>
				</div>


				<div class="col-md-3">
					<label for="state" class="form-label">State</label> <select
						class="form-select def" id="state" name="custState"
						style="border-radius: 10px;" required>
						<option selected disabled value="">Choose...</option>
						<option value="Maharashtra">Maharashtra</option>
						<option value="Gujarat">Gujarat</option>
						<option value="Madhya Pradesh">Madhya Pradesh</option>
						<option value="Rajasthan">Rajasthan</option>
						<option value="Telangana">Telangana</option>
						<option value="Andhra Pradesh">Andhra Pradesh</option>
						<option value="Tamil Nadu">Tamil Nadu</option>
						<option value="Karnataka">Karnataka</option>
						<option value="Kerela">Kerela</option>
					</select>
					<div class="invalid-feedback">Please select a valid state.</div>
					<div class="valid-feedback">Looks good!</div>
				</div>

				<div class="col-md-3">
					<label for="pincode" class="form-label">Pin Code</label> <input
						type="text" class="form-control def" id="pincode" name="custPin"
						placeholder="Enter your zip code" required>
					<div class="invalid-feedback">Please provide a valid pin
						code.</div>
					<div class="valid-feedback">Looks good!</div>
				</div>

				<div class="col-12">
					<div class="form-check">
						<input class="form-check-input def" type="checkbox" value=""
							id="agree" required> <label class="form-check-label"
							for="invalidCheck3"> Agree to terms and conditions </label>
						<div class="invalid-feedback">You must agree before
							submitting.</div>
					</div>
				</div>

				<div class="col-12 mt-4">
					<input type="submit" class="btn btn-danger disabled" id="register"
						value="Register">
					</button>
					<input type="reset" class="btn btn-danger ms-3 disabled"
						id="cancel" value="Cancel">
					</button>
					
				</div>
			</form>

		</div>

		<p class="text-center text-dark">
			Already Registered? Want to <a href="loginPageRequest"
				class="text-decoration-none">Sign in </a>
		</p>

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
	<!-- Custom JS -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/customer-register.js"></script>
</body>
</html>
