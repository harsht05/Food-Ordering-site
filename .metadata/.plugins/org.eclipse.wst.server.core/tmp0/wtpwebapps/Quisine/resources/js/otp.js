const fields = ['cust_email'];
const registerButton = document.getElementById('sub-btn');
const form = document.querySelector('form');

const agreeCheckbox = document.getElementById('agree');

        // Add event listener to the checkbox
        agreeCheckbox.addEventListener('input', function() {
            // Check if the checkbox is checked
            if (this.checked) {
                // Enable the submit button
                checkFormValidity();
            } 
        });

// Function to check overall form validity
function checkFormValidity() {

    let valid = true;

    for(const field of fields) {

        const inputField = document.getElementById(field);
        
        if(inputField !== 'agree') {
     
            if(inputField.classList.contains('is-invalid') || inputField.classList.contains('def')) {

                valid = false;
            }
        }
    }

    if (valid) {

        registerButton.setAttribute('class', 'btn btn-danger');
    } 

    else {
     
        registerButton.setAttribute('class', 'btn btn-danger disabled');
    }
}

document.addEventListener("DOMContentLoaded", function () {

    // Add event listeners for form fields
    fields.forEach(field => {
        const inputField = document.getElementById(field);
        inputField.addEventListener('input', function () {
            validateField(inputField);
        });
    });

    // Function to validate individual field
    function validateField(field) {

        if (field.validity.valid) {
            
            field.classList.remove('is-invalid');
            field.classList.remove('def');
            field.classList.add('is-valid');
        } 
        
        else {
            
            field.classList.remove('is-valid');
            field.classList.remove('def');
            field.classList.add('is-invalid');
        }

        // Additional validation for password and confirm password

        if (field.id === 'cust_email') {

		    const gmailRegex = /^[a-zA-Z0-9._-]+@gmail\.com$/;
		
		    if (!gmailRegex.test(document.getElementById('cust_email').value)) {
		        field.classList.remove('is-valid');
		        field.classList.remove('def');
		        field.classList.add('is-invalid');  
		    } else {
		        field.classList.remove('is-invalid');
		        field.classList.remove('def');
		        field.classList.add('is-valid');
		    }
		}
		
		if (field.id === 'otp') {

		    const otpRegex = /^\d{4}$/;

			if (!otpRegex.test(document.getElementById('otp').value)) {
			    // Invalid OTP
			    field.classList.remove('is-valid');
			    field.classList.add('is-invalid');
			} else {
			    // Valid OTP
			    field.classList.remove('is-invalid');
			    field.classList.add('is-valid');
			}
		}
    }
});