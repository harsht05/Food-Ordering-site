<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Food Item</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <style>
        body {
            background-color: grey;
            /* Dark background color */
            padding: 20px;
        }

        .card {
            background-color: #fff;
            /* White background color for the card */
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1), 0 1px 3px rgba(0, 0, 0, 0.08);
            /* Box shadow for card */
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }

        .restaurant-info {
            display: flex;
            align-items: center;
        }

        .restaurant-image img {
            max-width: 200px;
            height: auto;
            margin-right: 20px;
        }

        .restaurant-details h2 {
            margin-top: 0;
        }

        .restaurant-details p {
            margin: 5px 0;
        }
    </style>
</head>

<body>
    <div class="container">
        <div class="card p-4 mb-5 position-absolute top-50 start-50 translate-middle text-dark rounded">
            <h2 class="mb-4">Add New Food Item</h2>
            <form action="addFoodItems.html">
                <div class="mb-3">
                    <label for="itemName" class="form-label">Food Item Name</label>
                    <input type="text" class="form-control" id="itemName" name="foodName" required>
                </div>
                <div class="mb-3">
                    <label for="itemPrice" class="form-label">Price</label>
                    <input type="number" class="form-control" id="itemPrice" name="foodprice" required>
                </div>
             
                <div class="mb-3">
					<label for="imageInput" class="form-label">Food Image</label><br>
					<input type="file" class="" name="foodImage" id="imageInput">
				</div>
				
                <button type="submit" class="btn btn-danger">Add Food Item</button>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>