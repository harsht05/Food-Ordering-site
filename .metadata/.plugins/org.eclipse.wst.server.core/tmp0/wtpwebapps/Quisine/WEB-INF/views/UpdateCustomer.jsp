<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Update Profile</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/update-customer.css">
</head>
<body style="background-color: #ffc3a149">

	<div
		class="container position-absolute top-50 start-50 translate-middle p-2 mb-5 text-dark shadow-lg rounded">

		<p class="fw-bolder fs-2 text-center">Update Profile</p>

		<div class="container">

			<form class="row g-3" action="updateCustomer" method="post">

				<div class="col-md-6">
					<label for="fname" class="form-label">First name</label> <input
						type="text" class="form-control def" id="fname" name="custName"
						value="${cust.getCustName()}" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Enter a valid name!</div>
				</div>

				<div class="col-md-6">
					<label for="uemail" class="form-label">Email</label>
					<div class="input-group has-validation">
						<input type="email" class="form-control def" id="uemail"
							name="custEmail" value="${cust.getCustEmail()}"
							style="border-radius: 20px;" readonly>
						<div class="invalid-feedback">Please choose a username.</div>
						<div class="valid-feedback">Looks Good!</div>
					</div>
				</div>

				<div class="col-md-6">
					<label for="cnumber" class="form-label">Contact Number</label> <input
						type="text" class="form-control def" id="cnumber"
						name="custContact" value="${cust.getCustContact()}" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Enter a valid mobile number!</div>
				</div>

				
				<div class="col-md-6">
					<label for="city" class="form-label">City</label> <input
						type="text" class="form-control def" id="city" name="custCity"
						value="${cust.getCustCity()}" required>
					<div class="invalid-feedback">Please provide a valid city.</div>
					<div class="valid-feedback">Looks good!</div>
				</div>


				<div class="col-md-3">
					<label for="state" class="form-label">State</label> <select
						class="form-select def" id="state" name="custState"
						style="border-radius: 10px;" readonly>
						<option selected value="${cust.getCustState()}">${cust.getCustState()}</option>

					</select>
					<div class="invalid-feedback">Please select a valid state.</div>
					<div class="valid-feedback">Looks good!</div>
				</div>

				<div class="col-md-3">
					<label for="pincode" class="form-label">Pin Code</label> <input
						type="text" class="form-control def" id="pincode" name="custPin"
						value="${cust.getCustPin()}" required>
					<div class="invalid-feedback">Please provide a valid pin
						code.</div>
					<div class="valid-feedback">Looks good!</div>
				</div>


				<div class="text-center">
					<input type="submit" class="btn btn-danger m-2"
						value="Update Profile"> <a href="backToDashboard"
						class="btn btn-danger m-2">Back To Dashboard</a>
				</div>
			</form>

		</div>

	</div>
	<div class="position-fixed bottom-0 end-0 p-3">
		<a class="navbar-brand" href="#"> <img
			src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
			alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
		</a>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

</body>
</html>
