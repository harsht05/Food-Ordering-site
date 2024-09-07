/**
 * 
 */

const fields = ['fname', 'uemail', 'cnumber', 'upass', 'upassc', 'city', 'state', 'pincode'];
const registerButton = document.getElementById('register');
const cancelButton = document.getElementById('cancel');
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

        if(inputField.classList.contains('is-invalid') || inputField.classList.contains('def')) {

            console.log("");
            valid = false;
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
    
    checkFormValidity();

    // Add event listeners for form fields
    fields.forEach(field => {
        const inputField = document.getElementById(field);
        inputField.addEventListener('input', function () {
            validateField(inputField);
            cancelButton.setAttribute('class', 'btn btn-danger ms-3');
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

        if (field.id === 'upass') {
          
            if (document.getElementById('upass').value.length < 8) {
                
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

        if (field.id === 'upassc') {
         
            const password = document.getElementById('upass').value;
          
            if (field.value !== password) {
                
                field.classList.remove('is-valid');
                field.classList.remove('def');
                field.classList.add('is-invalid');  
            } 

            else {
                
                if(field.value.value.length >= 8) {
                    
                    field.classList.remove('is-invalid');
                    field.classList.remove('def');
                    field.classList.add('is-valid');
                }
            }
        }

        // Additional validation for phone number
        if (field.id === 'cnumber') {
            
            const phoneNumberRegex = /^[0-9]{10}$/;
            if (!phoneNumberRegex.test(field.value)) {
        
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

        // Additional validation for pin code
        if (field.id === 'pincode') {

            const phoneNumberRegex = /^[0-9]{6}$/;
            if (!phoneNumberRegex.test(field.value)) {
        
                field.classList.remove('is-valid');
                field.classList.remove('def');
                field.classList.add('is-invalid'); 
            }
            
            else {
                
                field.classList.remove('is-invalid');
                field.classList.add('is-valid');
                field.classList.remove('def');
            }
        }
    }
});