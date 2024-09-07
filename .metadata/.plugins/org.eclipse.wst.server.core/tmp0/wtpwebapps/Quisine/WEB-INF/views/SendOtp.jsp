<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"></link>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css">
</head>
<body style="background-color: #ffc3a149">
    
    <div class="container mb-2 position-absolute top-50 start-50 translate-middle p-3 mb-5 text-dark shadow-lg rounded">

        <p class="fw-bolder fs-2 text-center">Enter Your Email</p>

        <div class="container m-2">

            <form class="row g-3" action="sendOtp" method="post">
                
                <div class="col-md-12">
                    <label for="uemail" class="form-label">Email</label>
                    <div class="input-group has-validation">
                      <input type="text" class="form-control def" id="cust_email" name="cust_email" style="border-radius: 20px;" required>
                      <div class="invalid-feedback">
                        Please enter a valid username.
                      </div>
                      <div class="valid-feedback">
                        Looks Good!
                      </div>
                    </div>
                  </div>

              <div class="col-12">
			    <div class="form-check">
			      <input class="form-check-input def" type="checkbox" value=""  id="agree" required>
			      <label class="form-check-label" for="invalidCheck3">
			        Agree to terms and conditions
			      </label>
			    </div>
			  </div>
			 
              <div class="col-12 mt-4">
			    <input type="submit" class="btn btn-danger disabled" id="sub-btn" value="Send OTP"></button>
			  </div>

              </form>

        </div>
        
        <p class="position-fixed bottom-0 end--1 p-1 text-center text-dark">Already Registered? Want to <a href="loginPageRequest"
				class="text-decoration-none">Sign in </a></p>&nbsp;&nbsp;
      
		<div class="position-fixed bottom-0 end-0 p-3">
			<a class="navbar-brand" href="#"> <img
				src="${pageContext.request.contextPath}/resources/assests/icons/LOGO.png"
				alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
			</a>
		</div>

    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/otp.js"></script>
</body>
</html>