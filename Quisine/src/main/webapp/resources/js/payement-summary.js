const fields = ['card-number', 'card-holder', 'cvv'];
const form = document.querySelector('form');
const payNowButton = document.getElementById('sub-btn');

const agreeCheckbox = document.getElementById('agree');

// Add event listener to the checkbox
agreeCheckbox.addEventListener('input', function() {
	// Check if the checkbox is checked
	if (this.checked) {
		// Enable the submit button
		checkFormValidity();
	}
});

 function setMinDate() {
        var input = document.getElementById('expiry-date');
        var currentDate = new Date();
        var currentYear = currentDate.getFullYear();
        var currentMonth = currentDate.getMonth() + 1; // Month is zero-based

        // Format the current month and year
        var formattedMinDate = currentYear + '-' + (currentMonth < 10 ? '0' : '') + currentMonth;

        // Set the min attribute to disable previous months and years
        input.setAttribute('min', formattedMinDate);
    }

    // Call the function to set the minimum date when the page loads
    window.addEventListener('load', setMinDate);

// Function to check overall form validity
function checkFormValidity() {
	let valid = true;

	for (const field of fields) {
		const inputField = document.getElementById(field);

		if (inputField.classList.contains('is-invalid') || inputField.classList.contains('def')) {
			valid = false;
			break;
		}
	}

	if (valid) {

		payNowButton.setAttribute('class', 'btn btn-danger');
	}
	else {

		payNowButton.setAttribute('class', 'btn btn-danger disabled');
	}
}

document.addEventListener("DOMContentLoaded", function() {


	// Add event listeners for form fields
	fields.forEach(field => {
		const inputField = document.getElementById(field);
		inputField.addEventListener('input', function() {
			validateField(inputField);
		});
	});
	// Function to validate individual field
	function validateField(field) {
		if (field.validity.valid) {
			field.classList.remove('is-invalid');
			field.classList.remove('def');
			field.classList.add('is-valid');
		} else {
			field.classList.remove('is-valid');
			field.classList.remove('def');
			field.classList.add('is-invalid');
		}

		// Additional validation for expiry date (MM/YY)
		/*if (field.id === 'expiry-date') {
			const expiryDatePattern = /^(0[1-9]|1[0-2])\/?([0-9]{2})$/;
			if (!field.value.match(expiryDatePattern)) {
				field.classList.remove('is-valid');
				field.classList.remove('def');
				field.classList.add('is-invalid');
			}
		}*/

		if (field.id === 'card-number') {

			const cardNumberRegex = /^[0-9]{16}$/;
			if (!cardNumberRegex.test(field.value)) {

				field.classList.remove('is-valid');
				field.classList.remove('def');
				field.classList.add('is-invalid');
			}

			else {

				field.classList.remove('is-invalid');
				field.classList.remove('def');
				field.classList.add('is-valid');
			}
		}
	}
});
