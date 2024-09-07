<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<%@page import="com.cybage.model.Restaurant"%>
<html lang="en">


<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Restaurant Dashboard</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">
<style>
body {
	background-color: #ffc3a149;
}

.navbar {
	background-color: #dc3545;
}

footer {
	background-color: #dc3545;
	color: #fff;
	padding: 20px 0;
}

.navbar-nav .nav-link {
	color: black;
	font-size: 1.2rem;
}

.navbar {
	border-radius: 0;
	background-color:#A75D5D;
}

.navbar-brand img {
	width: 30px;
	height: auto;
}

.navbar-toggler {
	border: none;
}

.restaurant-details {
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.card {
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.card-title {
	color: #333;
}

.card {
	transition: transform 0.3s;
}

.card:hover {
	transform: scale(1.05);
}

.card-text {
	color: #666;
}
</style>
</head>

<body style="background-color: #ffc3a149">

	<nav class="navbar navbar-expand-lg bg-red">
		<div class="container">
			<a class="navbar-brand" href="#"> <img
				src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
				alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-center"
				id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active fs-5 fw-bold"
						aria-current="page" href="#">Home</a></li>
					<!-- <li class="nav-item"><a class="nav-link fs-5 fw-bold"
						href="./restaurant-dashboard-add_food_items.html">AddCustomizedItem</a></li> -->

					<li class="nav-item"><a class="nav-link fs-5 fw-bold"
						href="./restaurant-dashboard-add_food_items.html">Add Custom
							Items</a></li>

				</ul>

				<ul class="navbar-nav mb-2 mb-lg-0">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle fs-5 fw-bold" href="#"
						id="profileDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> <i class="fas fa-user-circle me-2"></i>
							Profile
					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="profileDropdown">
							<li><a class="dropdown-item" href="logout.html">Logout</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Restaurant Details -->
	<div class="container py-5">



		<div class="row justify-content-center">
			<div class="col-md-6">
				<div class="restaurant-details">
					<div class="restaurant-image mb-3 text-center">
						<img
							src="<c:out value="${pageContext.request.contextPath}/resources/assests/hotels/${restaurant.restImage}"></c:out>"
							alt="Restaurant Image" class="img-fluid rounded">
					</div>
					<h2 class="mb-3 text-center">
						<c:out value="${restaurant.restName}"></c:out>
					</h2>
					<table class="table table-borderless">
						<tbody>
							<tr>
								<td><strong>Contact:</strong></td>
								<td>${restaurant.restContact}</td>
							</tr>
							<tr>
								<td><strong>Location:</strong></td>
								<td><c:out value="${restaurant.restCity}"></c:out>, <c:out
										value="${restaurant.restState}"></c:out> <c:out
										value="${restaurant.restPincode}"></c:out></td>
							</tr>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!-- Food Items -->
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-10">
				<h3 class="mb-4 text-center">Your current food items</h3>
			</div>
		</div>
		<div class="row justify-content-center">
			<c:forEach items="${fooditem}" var="foodItem">
				<div class="col-md-4">
					<div class="card mb-3">
						<div class="card-body">
							<img class="card-img-top"
								src="${pageContext.request.contextPath}/resources/assests/food/${foodItem.getFooditems().getFoodImage()}"
								alt="Food Image" style="height: 200px;">
							<h5 class="text-center">${foodItem.getFooditems().getFoodName()}</h5>
							<p class="card-text text-center">
								<strong>Only at Rs. </strong> ${foodItem.getPrice()}
							</p>
							<div class="text-center">
								<a
									href="deleteFoodItem.html?fid=${foodItem.getFooditems().foodId}"
									class="btn btn-danger">Delete Item</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>


	</div>

	<!-- Footer -->
	<footer
		style="position: absolute; top: 100; width: 100%;background-color:#000000c5;">
		<div class="row justify-content-center align-items-center">
			<div class="col-auto">
				<a class="navbar-brand" href="#"> <img
					src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
					alt="Your Logo" height="80px" class="rounded" style="height: 60px;width: auto;">
				</a>
			</div>
			<div class="col-auto">
				<p style="color: white;">&copy; 2024 QUISINE. All rights reserved.</p>
			</div>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

</body>

</html>
