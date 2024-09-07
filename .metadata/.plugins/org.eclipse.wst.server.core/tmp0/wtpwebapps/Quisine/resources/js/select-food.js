let cart = {
    meals: [],
    totalPrice: 0
};

document.querySelectorAll(".add-to-cart").forEach(function(button) {
    button.addEventListener("click", function () {
        let item = this.getAttribute("data-item");
        let price = parseFloat(this.getAttribute("data-price"));
        let quantityId = this.getAttribute("data-quantity");

        document.querySelectorAll('.quantity-bar').forEach(function(bar) {
            bar.style.display = 'none';
        });

        document.getElementById(quantityId).style.display = 'block';

        let siblings = this.parentNode.querySelectorAll('.quantity-bar .decrease-quantity, .quantity-bar .increase-quantity, .quantity-bar .span-con');
        siblings.forEach(function(sibling) {
            sibling.style.display = 'inline';
        });

        let existingMealIndex = cart.meals.findIndex(meal => meal.item === item);
        if (existingMealIndex === -1) {
            cart.meals.push({
                item: item,
                price: price,
                quantity: 0
            });
        }

        updateSummary();
    });
});

document.querySelectorAll(".increase-quantity").forEach(function(button) {
    button.addEventListener("click", function () {
        let quantityElement = this.parentNode.querySelector('span');

        if (isNaN(parseFloat(quantityElement.textContent))) {
            quantityElement.textContent = "0";
        }

        quantityElement.textContent = parseInt(quantityElement.textContent) + 1;

        let item = this.closest('.card-body').querySelector('.add-to-cart').getAttribute('data-item');
        let existingMealIndex = cart.meals.findIndex(meal => meal.item === item);
        if (existingMealIndex !== -1) {
            cart.meals[existingMealIndex].quantity = parseInt(quantityElement.textContent);
        }

        updateSummary();
    });
});

document.querySelectorAll(".decrease-quantity").forEach(function(button) {
    button.addEventListener("click", function () {
        let quantityElement = this.parentNode.querySelector('span');
        let currentQuantity = parseInt(quantityElement.textContent);

        if (currentQuantity > 0) {
            quantityElement.textContent = currentQuantity - 1;

            let item = this.closest('.card-body').querySelector('.add-to-cart').getAttribute('data-item');
            let existingMealIndex = cart.meals.findIndex(meal => meal.item === item);
            if (existingMealIndex !== -1) {
                cart.meals[existingMealIndex].quantity = parseInt(quantityElement.textContent);
            }
        }

        if (parseInt(quantityElement.textContent) === 0) {
            let item = this.closest('.card-body').querySelector('.add-to-cart').getAttribute('data-item');
            let existingMealIndex = cart.meals.findIndex(meal => meal.item === item);
            if (existingMealIndex !== -1) {
                cart.meals.splice(existingMealIndex, 1);
            }

            let siblings = this.parentNode.querySelectorAll('.decrease-quantity, .increase-quantity, .span-con');
            siblings.forEach(function(sibling) {
                sibling.style.display = 'none';
            });
        }

        updateSummary();
    });
});

let deliveryFee = 40;
let convenienceFee = 20;

document.addEventListener("DOMContentLoaded", function() {
    
    convenienceFee = 20;
    deliveryFee = 40;
    cart.totalPrice = deliveryFee + convenienceFee;
    document.getElementById('deliveryFee').innerHTML = `Delivery Charges : &#8377;40`;
    document.getElementById('convenienceFee').innerHTML = `Convenience Fee : &#8377;20`;
    document.getElementById('totalPrice').innerHTML = `Total Price: &#8377;${cart.totalPrice.toFixed(2)}`;

});

function updateSummary() {
    let mealCount = cart.meals.reduce((sum, meal) => sum + meal.quantity, 0);
    let totalMealPrice = cart.meals.reduce((sum, meal) => sum + meal.price * meal.quantity, 0);

    if(totalMealPrice > 60) {

        document.getElementById("proceedButton").setAttribute("class", "btn btn-success mt-2");
    }

    else {

        document.getElementById("proceedButton").setAttribute("class", "btn btn-success mt-2 disabled");
    }
    
    // let subtotal = parseInt(deliveryfee) + parseInt(convenienceFee);
    cart.totalPrice = totalMealPrice + deliveryFee + convenienceFee;

    // document.getElementById('subTotal').textContent = `Subtotal: ₹${subtotal}`;
    document.getElementById('mealCharges').innerHTML = `Meal Charges: &#8377;${totalMealPrice}`;
    document.getElementById('mealCount').innerHTML = `Meals: ${mealCount > 0 ? cart.meals.map(meal => `${meal.item} * ${meal.quantity}`).join(', ') : 'None'}`;

    document.getElementById('totalPrice').innerHTML = `Total Price: &#8377;${cart.totalPrice.toFixed(2)}`;
    document.getElementById("proceedButton").style.display = "block";
}

document.getElementById("proceedButton").addEventListener("click", function() {
    // Set hidden input values with summary details
    document.getElementById("mealChargesF").value = document.getElementById("mealCharges").textContent;
    document.getElementById("mealCountF").value = document.getElementById("mealCount").textContent;
    document.getElementById("totalPriceF").value = document.getElementById("totalPrice").textContent;
});
