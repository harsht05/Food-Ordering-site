<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Food Form</h2>
	<div class="container">
		<form action="FoodRegProcess" method="post">
			<label for="foodName">Food Name:</label> <input type="text"
				id="foodName" name="foodName" required><br>
			<br> <label for="price">Price:</label> <input type="number"
				id="price" name="price" required><br>
			<br> <label for="foodImage">Food Image:</label> <input
				type="file" id="foodImage" name="foodImage" required><br>
			<br> <input type="submit" value="Submit">
		</form>
	</div>

	<div class="position-fixed bottom-0 end-0 p-3">
		<a class="navbar-brand" href="#"> <img
			src="${pageContext.request.contextPath}/resources/assests/icons/LOGO1.png"
			alt="Your Logo" style="height: 80px; width: 200px" class="rounded">
		</a>
	</div>

</body>
</html>