<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Food Items</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">
<style>
body {
	background-color: grey;
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
}

.navbar-brand img {
	width: 30px;
	height: auto;
}

.navbar-toggler {
	border: none;
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
#cust_height{
	min-height: 100vh;
}
#cust_footer{
	position: absolute;
	bottom:0px;
	width: 100%;
}
</style>
</head>
<body style="background-color: #ffc3a149">
	<nav class="navbar navbar-expand-lg bg-red">
		<div class="container">
			<a class="navbar-brand" href="#"> <img src="${pageContext.request.contextPath}/resources/assests/icons/LOGO1.png"
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
							<li><a class="dropdown-item" href="#">View Profile</a></li>
							<li><a class="dropdown-item" href="#">Update Profile</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="logout.html">Logout</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	
	
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-10">
				<h3 class="mb-4 text-center">Food Items You can Add</h3>
			</div>
		</div>
		<div class="row justify-content-center">
			<c:forEach items="${missingFoodItems}" var="foodItem">
				<div class="col-md-4">
					<div class="card mb-3">
						<div class="card-body">
							<img class="card-img-top"
								src="${pageContext.request.contextPath}/resources/assests/food/${foodItem.foodImage}"
								alt="Food Image">
							<h5 class="text-center">${foodItem.foodName}</h5>
							<%-- <p class="card-text text-center">
								<strong>Only at Rs. </strong> ${foodItem.foodprice}
							</p> --%>
							<div class="text-center">
								<a href="addItemToRestaurant?foodId=${foodItem.foodId}" class="btn btn-danger">Add Item</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div> 
	
	
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6 text-center mb-4">
				<a href="./restaurant-dashboard-add_food_items.html"
					class="btn btn-danger fs-5 fw-bold">Add Custom Items</a>
			</div>
		</div>
	</div>
<footer
		style="position: absolute; top: 100; width: 100%;background-color:#000000c5;">
		<div class="row justify-content-center align-items-center">
			<div class="col-auto">
				<a class="navbar-brand" href="#"> <img
					src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
					alt="Your Logo" height="80px" class="rounded">
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
