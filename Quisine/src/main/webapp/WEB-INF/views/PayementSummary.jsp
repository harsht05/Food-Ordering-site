<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payement Gateway</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/payement-summary.css">
    <style type="text/css">
#custHeight {
	min-height: 100vh;
}
</style>
</head>
<body style="background-color: #ffc3a149">
   
<!-- Navbar final :  -->

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
                      <i class="fas fa-user-circle me-2"> Hi, <%= session.getAttribute("cust_name") %></i>
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
    
    
    <div class="container-fluid p-2" id="custHeight">
        <div class="row p-5">

            <div class="payment-form col-md-6 bg-white">
                <h2>Payment Details</h2>
                <form id="payment-form" action="placeOrder" method="post">
                    <div class="mb-3">
                        <label for="card-number" class="form-label">Card Number</label>
                        <input type="number" class="form-control" id="card-number" placeholder="Enter card number"
                            required inputmode="numeric">
                        <div class="invalid-feedback">Please enter a valid 16-digit card number.</div>
                        <div class="valid-feedback">Looks Good!</div>
                    </div>

                    <div class="mb-3">
                        <label for="card-holder" class="form-label">Card Holder Name</label>
                        <input type="text" class="form-control" id="card-holder" placeholder="Enter card holder name"
                            required>
                        <div class="invalid-feedback">Please enter the card holder's name.</div>
                    </div>
                    <div class="row">
                        <div class="col-md-6 mb-3">
                            <label for="expiry-date" class="form-label">Expiry Date (MM/YY)</label>
                            <input type="month" class="form-control" id="expiry-date" placeholder="MM/YY" required>
                            </div>
                        <div class="col-md-6 mb-3">
                            <label for="cvv" class="form-label">CVV</label>
                            <input type="password" class="form-control" id="cvv" placeholder="Enter CVV"
                                pattern="[0-9]{3}" required>
                            <div class="invalid-feedback">Please enter a valid 3-digit CVV.</div>
                        </div>
                    </div>

                    <div class="col-12">
                        <div class="form-check">
                            <input class="form-check-input def" type="checkbox" value="" id="agree" required>
                            <label class="form-check-label" for="invalidCheck3">
                                Agree to terms and conditions
                            </label>
                            <div class="invalid-feedback">
                                You must agree before submitting.
                            </div>
                        </div>
                    </div>

                    <button type="submit" class="btn btn-danger disabled" id="sub-btn">Pay Now</button>
                </form>
            </div>

            <div class="col-md-4">
                <div class="summary p-3 m-3 bg-white rounded">
                  <h4>Summary</h4>
                  <p id="mealCharges">${summary.getMeal_charges()}</p>
                  <p id="mealCount">${summary.getMeals()}</p>
                  
                  <hr>
                  
                  <p id="deliveryFee">Delivery Charges : &#8377;40</p>
                  <p id="convenienceFee">Convenience Fee : &#8377;20</p>
    
                  <hr>
                  <p id="totalPrice">${summary.getTotal_price()}</p>
                
                </div>
              </div>

        </div>
    </div>
    

    <!-- Footer -->
   <footer
		style="position: sticky; bottom:0; width: 100%; background-color:#000000c5">
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
	<script src="${pageContext.request.contextPath}/resources/js/payement-summary.js"></script>
</body>
</html>
