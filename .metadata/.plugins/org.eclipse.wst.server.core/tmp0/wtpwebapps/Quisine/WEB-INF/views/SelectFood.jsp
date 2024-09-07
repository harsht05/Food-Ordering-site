<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Select Food</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/select-food.css">

<style type="text/css">
#custHeight {
	min-height:100vh;
}
</style>
</head>
<body style="background-color: #ffc3a149 !important;">

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark">
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

<div class="container-fluid p-1" id="custHeight">

    <p class="fw-bolder fs-2 text-center heading">Fresh in ${rest_name}</p>

	<div class="container p-2">
        <div class="row card_container">
          <div class="col-md-8">
          
          <div class="d-flex justify-content-center gap-4 flex-row flex-wrap mb-3 cards-container">

		<%int i = 1; %>
		<c:forEach var="food" items="${food_list}">
	            
	            <div class="card m-2 rounded" style="width: 18rem;">
                <img src="${pageContext.request.contextPath}/resources/assests/food/${food.getFooditems().getFoodImage()}" class="card-img-top" alt="..." style="height: 200px;">
                <div class="card-body">
                  <p class="card-title fs-4 fw-semibold">${food.getFooditems().foodName}</p>
                  <p class="card-text fs-5">Starting at just <b>&#8377; ${food.getPrice()}</b> </p>
                
                	<button class="btn btn-danger add-to-cart p-2 mb-2" data-item="${food.getFooditems().getFoodName()}" data-price="${food.getPrice()}" data-quantity="meal<%=i %>Quantity"> Add to Cart</button>
                 
                        
                        <div class="quantity-bar" id="meal<%=i %>Quantity">
                            <button type="button" class="btn btn-success decrease-quantity" style="display: none"> - </button>
                            <span class="p-2 span-con" id="span-con"></span>
                            <button type="button" class="btn btn-success increase-quantity" style="display: none"> + </button>
                        </div>
                </div>
              </div>
              
              <%i++; %>
	            
	        </c:forEach>
		
    </div>
          
          </div>    
          
          <div class="col-md-4">
            <div class="summary bg-white p-3 rounded">
              <p class="fs-4 fw-semibold">Summary</p>
              <p class="fs-6 fw-normal" id="mealCharges">Meal Charges : &#8377;0</p>
              <p class="fs-6 fw-normal" id="mealCount">Meals : None</p>
              <!-- <p id="mealTotal">Meal total : 0</p> -->
              
              <hr>
              
              <p class="fs-6 fw-normal" id="deliveryFee">Delivery Charges : &#8377;0</p>
              <p class="fs-6 fw-normal" id="convenienceFee">Convenience Fee : &#8377;0</p>

              <hr>
              <p class="fs-6 fw-normal" id="totalPrice">Total Price : &#8377;0</p>

				<form id="summaryForm" action="payementSummaryPage" method="post">
				    <input type="hidden" id="mealChargesF" name="meal_charges">
				    <input type="hidden" id="mealCountF" name="meals">
				    <input type="hidden" id="totalPriceF" name="total_price">
				    <button type="submit" class="btn btn-success mt-2 disabled" id="proceedButton">Proceed</button>
				</form>

              <!-- Proceed button -->
              <!-- <button class="btn btn-success mt-2 disabled" id="proceedButton"> Proceed </button> -->
            </div>
          </div>
        </div>
	</div>
</div>

<footer
		style="position: sticky; bottom:0; width: 100%;background-color:#000000c5;">
		<div class="row justify-content-center align-items-center">
			<div class="col-auto">
				<a class="navbar-brand" href="#"> <img
					src="<%=request.getContextPath()%>/resources/assests/icons/LOGO.png"
					alt="Your Logo" height="80px" class="rounded" style="height: 80px;width: auto;">
				</a>
			</div>
			<div class="col-auto">
				<p style="color: white;">&copy; 2024 QUISINE. All rights reserved.</p>
			</div>
		</div>
	</footer>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/js/select-food.js" type="text/javascript"></script>

</body>
</html>
