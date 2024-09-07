<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/query-result.css">
    
    <style type="text/css">
#custHeight {
	min-height:100vh;
}
</style>
</head>
<body style="background-color: #ffc3a149 !important">
   
<!-- Navbar final :  -->

<nav class="navbar navbar-expand-lg navbar-dark" style="background-color:#A75D5D !important;">
  <div class="container">
    <!-- Logo with Background -->
    <!-- Logo -->
    <a class="navbar-brand" href="#">
      <img src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
				alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
    </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
              data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
              aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-center" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                  <a class="nav-link active fs-5 fw-bold" aria-current="page" href="backToDashboard">Home</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link fs-5 fw-bold" href="ordersPage">Orders</a>
              </li>
          </ul>
          
          <ul class="navbar-nav mb-2 mb-lg-0">
              <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle fs-5 fw-bold" href="#" id="profileDropdown" role="button"
                     data-bs-toggle="dropdown" aria-expanded="false">
                      <i class="fas fa-user-circle me-2"> Hi, <%=session.getAttribute("cust_name") %></i>
                  </a>
                  <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="profileDropdown">
                      <li><a class="dropdown-item" href="viewCustomerRequest">View Profile</a></li>
                      <li><a class="dropdown-item" href="updateCustomerPage">Update Profile</a></li>
                      <li><hr class="dropdown-divider"></li>
                      <li><a class="dropdown-item" href="logoutRequest">Logout</a></li>
                  </ul>
              </li>
          </ul>
      </div>
  </div>
</nav>
    

    <!-- Hotels Container -->

    <div class="container-fluid p-3" id="custHeight">
    
		<c:choose>
            <c:when test="${empty restaurants}">
            <p class="fw-bolder fs-2 text-center heading">Sorry, No Results Found</p>
                <!-- Display image or message indicating no results found -->
                <div class="text-center">
                    <img src="images/noresultfound.jfif" alt="No Results Found" style="height: 450px;">
                </div>
                
                
            </c:when>
            <c:otherwise>
            
        <p class="fw-bolder fs-2 text-center heading">Your Search Results</p>

        <div class="d-flex justify-content-center gap-4 flex-row flex-wrap mb-3 cards-container">
			
			
                <!-- Display hotels -->
                <c:forEach var="rest" items="${restaurants}">
                    <div class="card m-2 rounded" style="width: 18rem;">
                        <img src="${pageContext.request.contextPath}/resources/assests/hotels/${rest.getRestImage()}" class="card-img-top" alt="...">
                        <div class="card-body">
                            <p class="card-title fs-4 fw-semibold">${rest.getRestName()}</p>
                            <p class="card-title fs-4 fw-semibold">${rest.getRestCity()}</p>
                            <p class="card-text fs-5">Starting at just <b>&#8377; 99</b> </p>
                            <a href="selectFoodPage?id=${rest.getRestId()}" class="btn btn-danger">Order Now</a>
                        </div>
                    </div>
                </c:forEach>
            </c:otherwise>
        </c:choose>
        </div>
    
	

    <!-- Footer -->
    <footer
		style="position: absolute; bottom :0; width: 100%; background-color:#000000c5;">
		<div class="row justify-content-center align-items-center">
			<div class="col-auto">
				<a class="navbar-brand" href="#"> <img
					src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
					alt="Your Logo" height="80px" class="rounded"style="height: 60px;width: auto;">
				</a>
			</div>
			<div class="col-auto">
				<p style="color: white;">&copy; 2024 QUISINE. All rights reserved.</p>
			</div>
		</div>
	</footer>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>
	
</body>
</html>
