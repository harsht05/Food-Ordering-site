<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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

<body style="background-color: #ffc3a149;">
	<!-- Navbar final :  -->

	<nav class="navbar navbar-expand-lg navbar-dark sticky-top">
		<div class="container">
			<!-- Logo with Background -->

			<a class="navbar-brand" href="#"> <img
				src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
				alt="Your Logo" height="80px" class="rounded">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse justify-content-between"
				id="navbarSupportedContent">
				<!-- Filter -->
				<ul class="navbar-nav">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle fs-5 fw-bold" href="#"
						id="navbarDropdown" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> Filters <img
							src="resources/assests/icons/filter.png" height="18em"
							class="align-middle" alt="...">
					</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Filter by Food</a></li>
							<li><a class="dropdown-item" href="#">Filter by Hotel</a></li>
							<li><a class="dropdown-item" href="#">Filter by City</a></li>
							<li><a class="dropdown-item" href="#">Filter by Pin Code</a></li>
						</ul></li>
				</ul>

				<div class="navbar-nav">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active fs-5 fw-bold"
							aria-current="page" href="#">Home <img
								src="resources/assests/icons/home.png" height="19em"
								class="align-middle" alt="..."></a></li>
						<li class="nav-item"><a class="nav-link fs-5 fw-bold"
							href="#">Orders <img
								src="resources/assests/icons/checkout.png" height="19.5em"
								class="align-middle" alt="..."></a></li>
					</ul>
					<form action="searchProcess" method="get" class="d-flex">
						<input class="form-control me-2" type="search" id="search-bar"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-light submit-btn" type="submit">Search</button>
					</form>
					<form action="loginPageRequest" method="post" class="d-flex">

						<button class="btn btn-outline-light submit-btn" type="submit">Login/Singup</button>
					</form>
				</div>
			</div>
		</div>
	</nav>


	<!-- Foods Container -->


	<!-- First Carousel -->

	<div id="carouselExampleInterval" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<c:forEach var="food" items="${allfood}" varStatus="loop">
				<c:if test="${loop.index % 3 == 0}">
					<div class="carousel-item ${loop.index == 0 ? 'active' : ''}"
						data-bs-interval="3000">
						<div class="container-fluid p-3">
							<p class="fw-bolder fs-2 text-center heading">What's in Your
								Mind</p>
							<div
								class="d-flex justify-content-center gap-4 flex-row flex-wrap mb-3 cards-container">
				</c:if>
				<div class="card m-2 rounded border border-danger"
					style="width: 18rem;">
					<img src="resources/assests/food/${food.foodImage}"
						class="card-img-top rounded" alt="${food.foodName}">
					<div class="card-body">
						<p class="card-title fs-4 fw-semibold">${food.foodName}</p>
						<p class="card-text fs-5">
							Starting at just <b>&#8377; 199</b>
						</p>
						<a href="#" class="btn btn-danger btn-animate">Order Now</a>
					</div>
				</div>
				<c:if test="${loop.index % 3 == 2 or loop.last}">
		</div>
		<!-- closing div for cards-container -->
	</div>
	<!-- closing div for container-fluid -->
	</div>
	<!-- closing div for carousel-item -->
	</c:if>
	</c:forEach>
	</div>
	<!-- closing div for carousel-inner -->
	</div>
	<!-- closing div for carouselExampleInterval -->
	<button class="carousel-control-prev" type="button"
		data-bs-target="#carouselExampleInterval" data-bs-slide="prev">
		<span class="carousel-control-prev-icon" aria-hidden="true"><img
			src="resources/assests/icons/arrow_left.png" height="35em"
			class="align-middle" alt=".."></span> <span class="visually-hidden">Previous</span>
	</button>
	<button class="carousel-control-next" type="button"
		data-bs-target="#carouselExampleInterval" data-bs-slide="next">
		<span class="carousel-control-next-icon" aria-hidden="true"><img
			src="resources/assests/icons/arrow-right.png" height="35em"
			class="align-middle" alt="..."></span> <span class="visually-hidden">Next</span>
	</button>

	<!--Top Restaurant chains!  -->
	<div id="carouselExampleInterval" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<c:forEach items="${allrest}" var="restaurant" varStatus="status">
				<c:if test="${status.index % 3 == 0}">
					<div class="carousel-item ${status.index == 0 ? 'active' : ''}"
						data-bs-interval="3000">
						<div class="container-fluid p-3">
							<p class="fw-bolder fs-2 text-center heading">Top Restaurant
								chains!</p>
							<div
								class="d-flex justify-content-center gap-4 flex-row flex-wrap mb-3 cards-container">
								<c:forEach begin="${status.index}" end="${status.index + 2}"
									varStatus="innerStatus">
									<c:set var="currentIndex" value="${innerStatus.index}" />
									<c:if test="${currentIndex lt allrest.size()}">
										<div class="card m-2 rounded border border-danger"
											style="width: 18rem;">
											<img
												src="${pageContext.request.contextPath}/resources/assests/hotels/${allrest[currentIndex].restImage}"
												class="card-img-top" alt="..." style="height: 200px;">
											<div class="card-body">
												<p class="card-title fs-4 fw-semibold"
													style="white-space: nowrap; overflow: hidden; text-overflow: ellipsis; max-width: 100%;">${allrest[currentIndex].restName}</p>
												<a href="#" class="btn btn-danger btn-animate">Order Now</a>
											</div>
										</div>
									</c:if>
								</c:forEach>
							</div>
						</div>
					</div>
				</c:if>
			</c:forEach>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"><img
				src="resources/assests/icons/arrow_left.png" height="35em"
				class="align-middle" alt=".."></span> <span class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"><img
				src="resources/assests/icons/arrow-right.png" height="35em"
				class="align-middle" alt="..."></span> <span class="visually-hidden">Next</span>
		</button>
	</div>





	<br>

	<div>
		<span><img src="resources/assests/banner.jpg"
			class="d-block w-100" style="height: 350px" alt="..."></span>
	</div>


	<br>
	<!-- Online food oreding in your location -->
	<div class="container-fluid p-3">
		<p class="fw-bolder fs-2 text-center heading">Restaurants with
			online food delivery</p>
		<div class="row justify-content-center gap-4 mb-3 cards-container">
			<c:if test="${not empty allrest}">
				<c:forEach items="${allrest}" var="restaurant">
					<div class="col-12 col-sm-4 col-md-4 col-lg-4 col-xl-3">
						<div class="card m-2 rounded border border-danger"
							style="width: 18rem;">
							<c:if test="${not empty restaurant.restImage}">
								<img
									src="${pageContext.request.contextPath}/resources/assests/hotels/${restaurant.restImage}"
									class="card-img-top" alt="..." style="height: 200px;">
							</c:if>
							<div class="card-body">
								<c:if test="${not empty restaurant.restName}">
									<p class="card-title fs-4 fw-semibold"
										style="white-space: nowrap; overflow: hidden; text-overflow: ellipsis; max-width: 100%;">${restaurant.restName}</p>
								</c:if>
								<a href="#" class="btn btn-danger">Order Now</a>
							</div>
						</div>
					</div>
				</c:forEach>
			</c:if>
			<c:if test="${empty allrest}">
				<p>No restaurants available.</p>
			</c:if>
		</div>
	</div>

	<div class="container-fluid p-3">
		<p class="fw-bolder fs-2 text-center heading">Best Quisine's Near
			Me</p>
		<div class="row justify-content-center gap-4 mb-3 cards-container">
			<c:forEach items="${allfood}" var="food">
				<div class="col-12 col-sm-4 col-md-4 col-lg-4 col-xl-3 col">
					<div class="card m-2 rounded border border-danger"
						style="width: 18rem;">
						<button type="button" class="btn btn-light">
							<c:out value="${food.foodName}" />
						</button>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<!-- Footer -->
	<footer style="background-color:#000000c5">
		<div class="container-fluid">
			<div class="row justify-content-center align-items-center">
				<div class="col-auto">
					<a class="navbar-brand" href="#"> <img
						src="resources/assests/icons/LOGO.png" alt="Your Logo"
						height="80px" class="rounded">
					</a>
				</div>
				<div class="col-auto" style="">
					<p style="color: white;">&copy; 2024 QUISINE. All rights reserved.</p>
				</div>
			</div>
		</div>
	</footer>

</body>
</html>