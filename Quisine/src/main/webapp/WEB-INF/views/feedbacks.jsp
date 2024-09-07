<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Food Online from India's Best Food Delivery Service
	|QUISINE</title>

<link href="${pageContext.request.contextPath}/resources/css/Index.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
body {
	background-color: #f8f9fa;
	font-family: Arial, sans-serif;
}


.table {
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
	width: 100%;
	border-collapse: collapse;
	overflow: hidden;
}

.table th, .table td {
	padding: 12px 15px;
	border-bottom: 1px solid #dee2e6;
	text-align: left;
}

.table th {
	background-color: #343a40;
	color: #fff;
}

.table-striped tbody tr:nth-of-type(odd) {
	background-color: rgba(0, 0, 0, 0.05);
}

/* Hover effect */
.table tbody tr:hover {
	background-color: rgba(0, 0, 0, 0.075);
	transition: background-color 0.3s ease;
}
</style>

<body style="background-color: #ffc3a149;">
	<!-- Navbar final :  -->

	<nav class="navbar navbar-expand-lg navbar-dark sticky-top">
		<div class="container">
			<a class="navbar-brand" href="#"> <img
				src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
				alt="Your Logo" height="80px" class="rounded">
			</a> <a class="navbar-brand" href="backtoadmin">Admin Dashboard <img
				src="<%=request.getContextPath()%>/resources/assests/icons/home.png"
				height="17em" class="align-middle"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link"
						href="restaurants.html">Restaurant Owners <img
							src="<%=request.getContextPath()%>/resources/assests/icons/restaurant_icon.png"
							height="17em" class="align-middle">
					</a></li>
					<li class="nav-item"><a class="nav-link" href="orders.html">Orders
							<img
							src="<%=request.getContextPath()%>/resources/assests/icons/checkout.png"
							height="18em" class="align-middle">
					</a></li>
					<li class="nav-item"><a class="nav-link" href="users.html">Users
							<img
							src="<%=request.getContextPath()%>/resources/assests/icons/user.png"
							height="18em" class="align-middle">
					</a></li>

					<li class="nav-item ml-auto mr-0" style="float: right;"><a
						class="nav-link" href="logoutRequest">Logout</a></li>



				</ul>
			</div>

		</div>
	</nav>


	<div class="container">
		<h1 class="text-center mb-4">Feedback Table</h1>
		<div class="table-responsive">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Feedback ID</th>
						<th>Username</th>
						<th>User Email</th>
						<th>Experience</th>
						<th>Feedback Description</th>
						<th>Recommend</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="feedback" items="${allfeed}">
						<tr>
							<td>${feedback.getFid()}</td>
							<td>${feedback.getUsername()}</td>
							<td>${feedback.getUser_email()}</td>
							<td>${feedback.getExperince()}</td>
							<td>${feedback.getFeedback_desc()}</td>
							<td>${feedback.getRecommend() == 1 ? 'Yes' : 'No'}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<footer style="position:absoulte;bottom:0;background-color: #000000c5">
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
</body>
</html>