var minUserLen = 3, maxUserLen = 6;
         var minPassLen = 4, maxPassLen = 16;
         var usernameMsg = "Employee ID must be between " + minUserLen + " and " +
                           maxUserLen + " characters, inclusive.";
         var passwordMsg = "Password must be between " + minPassLen + " and " +
                           maxPassLen + " characters, inclusive.";
         /*jQuery.validator.setDefaults({
            debug: true,      //Avoids form submit. Comment when in production.
            success: "valid",
            submitHandler: function() {
               alert("Success! The form was pretend-submitted!");
            }
         });*/
$(document).ready(function() {
         // validate signup form on keyup and submit
         $("#form").validate({
            rules: {
            	EMP_ID: {
                  required: true,
                  minlength: minUserLen,
                  maxlength: maxUserLen
 
               },
               Admin_ID: {
                   required: true,
                   minlength: minUserLen,
                   maxlength: maxUserLen
  
                },
               PASSWORD: {
                  required: true,
                  minlength: minPassLen,
                  maxlength: maxPassLen
 
               },
            },
            messages: {
            	EMP_ID: {
                  required: "Employee ID required",
                  minlength: usernameMsg,
                  maxlength: usernameMsg
               },
               Admin_ID: {
                   required: "Admin ID required",
                   minlength: usernameMsg,
                   maxlength: usernameMsg
                },
               PASSWORD: {
                  required: "Password required",
                  minlength: passwordMsg,
                  maxlength: passwordMsg
               }
            }
         });
      });



