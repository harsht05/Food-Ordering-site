<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Your Orders</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer.css">
<style type="text/css">
#custHeight {
	min-height: 100vh;
}
</style>
</head>
<body style="background-color: #ffc3a149">

	<nav class="navbar navbar-expand-lg navbar-dark">
		<div class="container">
			<!-- Logo with Background -->
			<!-- Logo -->
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
						aria-current="page" href="backToDashboard">Home</a></li>
					<li class="nav-item"><a class="nav-link fs-5 fw-bold"
						href="ordersPage">Orders</a></li>

				</ul>

				<ul class="navbar-nav mb-2 mb-lg-0">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle fs-5 fw-bold" href="#"
						id="profileDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> <i class="fas fa-user-circle me-2"> Hi, <%=session.getAttribute("cust_name")%></i>

					</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="profileDropdown">
							<li><a class="dropdown-item" href="viewCustomerRequest">View
									Profile</a></li>
							<li><a class="dropdown-item" href="updateCustomerPage">Update
									Profile</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="logoutRequest">Logout</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid p-3" id="custHeight">
		<div class="row justify-content-center">
			<div class="col-md-6 g-3">

				<p class="mt-2 fw-bolder fs-2 text-center heading">Your Orders</p>

				<c:forEach var="order" items="${orders_list}">

					<div class="card mt-4">
						<div class="card-body">

							<!-- Display order details here -->
							<p class="fw-bold">Order ID: #${order.getOrder_id()}</p>
							<p>Food Name : ${order.getFood().getFoodName()}</p>
							<p>Quantity : ${order.getQuantity()}</p>
							<p>Restaurant Name : ${order.getRestaurent().getRestName()}</p>
							<p>Total Amount: ${order.getTotal_price()}</p>
							<p>Ordered Date: ${order.getDate()}</p>
							<p>Delivery Address: ${order.getCustomer().getCustCity()},
								${order.getCustomer().getCustState()},
								${order.getCustomer().getCustPin()}</p>
						</div>
					</div>

				</c:forEach>

				<div class="text-center mt-3">
					<a href="backToDashboard" class="btn btn-danger">Back to
						Dashboard</a>
				</div>
			</div>
		</div>
	</div>


	<footer style="position: absolute; top: 100; width: 100%;background-color:#000000c5;">
		<div class="row justify-content-center align-items-center">
			<div class="col-auto">
				<a class="navbar-brand" href="#"> <img
					src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
					alt="Your Logo" height="80px" class="rounded"style="height: 60px;width: auto;">
				</a>
			</div>
			<div class="col-auto">
				<p>&copy; 2024 QUISINE. All rights reserved.</p>
			</div>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>


</body>
</html>