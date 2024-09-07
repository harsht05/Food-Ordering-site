<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Food Online from India's Best Food Delivery Service
	| QUISINE</title>
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

#custHeight {
	min-height:100vh;
}

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
<body>
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg navbar-dark sticky-top">
		<div class="container">
			<a class="navbar-brand" href="#"> <img
				src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
				alt="Your Logo" height="50px" class="rounded"
				style="height: 80px; width: auto;">
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

					<li class="nav-item ml-auto mr-0"><a class="nav-link"
						href="logoutRequest">Logout</a></li>



				</ul>
			</div>

		</div>
	</nav>

	<div class="container mt-5" id="custHeight">
    <%@ page import="java.util.List"%>
    <div class="row justify-content-center">
        <!-- Cards -->
        <%
        String[] sectionTitles = { "Users", "Restaurants", "Orders", "Feedbacks" };
        String[] sectionContent = { "Users around the year", "Total Restaurants", "Orders around the year", "All Feedback's" };
        String[] listAttributes = { "allusers", "showrest", "allorders", "allfeed" };

        for (int i = 0; i < sectionTitles.length; i++) {
            List<?> list = (List<?>) request.getAttribute(listAttributes[i]);
            int count = list != null ? list.size() : 0;

            // Determine column size for the cards
            String colSize = "col-md-4";
            if (i == 3) { // If it's the fourth card
                colSize += " mt-4"; // Add margin top to separate it from the third card
            }
        %>
        <div class="<%=colSize%> mb-4">
            <div class="card rounded border border-danger">
                <div class="card-body text-center">
                    <h5 class="card-title">
                        <h3><%=sectionTitles[i]%></h3>
                        <h1 style="font-weight: semi-bold;"><%=count%></h1>
                        <p class="card-text"><%=sectionContent[i]%></p>
                    </h5>
                    <a href="<%=request.getContextPath()%>/<%=sectionTitles[i].toLowerCase()%>"
                        class="btn btn-danger">View Details</a>
                </div>
            </div>
        </div>
        <%
        }
        %>
    </div>
    
	<div class="container mt-5">
		<h3 class="text-center mb-4 text-danger">
			<strong> <i> Orders By Date</i></strong>
		</h3>
		<div class="table-responsive rounded">
			<table class="table table-striped ">
				<thead>
					<tr>
						<th>Date</th>
						<th>Counts</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="entry" items="${ordercount}">
						<tr>
							<td>${entry.key}</td>
							<td>${entry.value}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>




	<footer style="background-color: #000000c5">
		<div class="row justify-content-center align-items-center">
			<div class="col-auto">
				<a class="navbar-brand" href="#"> <img
					src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
					alt="Your Logo" height="60px" class="rounded">
				</a>
			</div>
			<div class="col-auto">
				<p style="color: white;">&copy; 2024 QUISINE. All rights reserved.</p>
			</div>
		</div>
	</footer>


</body>
</html>
