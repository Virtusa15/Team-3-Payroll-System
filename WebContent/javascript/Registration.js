
var minUserLen = 3, maxUserLen = 16;
         var minPassLen = 4, maxPassLen = 16;
         var usernameMsg = "username must be between " + minUserLen + " and " +
                           maxUserLen + " characters, inclusive.";
         var passwordMsg = "Password must be between " + minPassLen + " and " +
                           maxPassLen + " characters, inclusive.";
         
         /*jQuery.validator.addMethod("customEmail", function(value, element) {
             return this.optional(element) || /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i.test(value);
            }, "Please enter valid email address!");*/
         
$(document).ready(function() {
	
         // validate signup form on keyup and submit
         $("#form").validate({
        	 errorPlacement: function(error, element) {
        		 error.css({'color':'red'});
        	        error.addClass('error');
        	        error.insertAfter(element);
        	    },
            rules: {
            	EMP_ID: {
                  required: true,
                  minlength: minUserLen,
                  maxlength: maxUserLen
               
 
               },
               EMP_NAME: {
                   required: true,
         
  
                },
                EMP_EMAIL: {
                    required: true,
                  //  customEmail:true
   
                 },
                 DOB: {
                     required: true,
                  
    
                  },
                  BANK_ACNO: {
                      required: true,
                      minlength: minUserLen,
                      maxlength: maxUserLen
                   
     
                   },
                   DOJ: {
                       required: true,
                       minlength: minUserLen,
                       maxlength: maxUserLen
                    
      
                    },
                    DEPARTMENT: {
                        required: true,
                      },
                     DESIGNATION: {
                         required: true,
                      },
                      SALARY: {
                          required: true,
                       },
                       JOB_LOCATION: {
                           required: true,
                        },
         
               PASSWORD: {
                  required: true,
                  minlength: minPassLen,
                  maxlength: maxPassLen
 
               }
            },
            messages: {
            	EMP_ID: {
                  required: "Employee ID required",
                  minlength: usernameMsg,
                  maxlength: usernameMsg
               },
               EMP_NAME: {
                   required: "Employee Name required",
      
                },
                EMP_EMAIL: {
                    required: "Emaii required",
          
                 },
                 DOB: {
                     required: "Date of Birth required",
                     
                  },
                  BANK_ACNO: {
                      required: "Bank Account required",
                      minlength: usernameMsg,
                      maxlength: usernameMsg
                   },
                   DOJ: {
                       required: "Date of Joining required",
                       
                    },
                    DEPARTMENT: {
                        required: "Department required",
                        
                     },
                     DESIGNATION: {
                         required: "Designation required",
                         
                      },
                      SALARY: {
                          required: "Salary required",
                          
                       },
                       JOB_LOCATION: {
                           required: "Job Location required",
                           
                        },
               PASSWORD: {
                  required: "Password required",
                  minlength: passwordMsg,
                  maxlength: passwordMsg
               }
            }
         });
      });



