$("#loginform").submit(function(event){
   var email = $('input[name=inputEmail]').val();
   var password = $('input[name=inputPassword]').val();
   var obj ={
   	  "email":email,
   	  "password":password
   }
   $.ajax({
       url: '/ec2demo/rest/services/doLogin/login',
       type: 'post',
       dataType: 'json',
       success: function (data) {
    	  console.log(data +' Data');
       },
       data: JSON.stringify(obj)
   });
});

$("#signupform").submit(function(event){
	var fname = $('input[name=inputFName]').val();
    var lname = $('input[name=inputLName]').val();
	var email = $('input[name=inputEmail]').val();
	var password = $('input[name=inputPassword]').val();
	var phonenumber = $('input[name=phoneNumber]').val();
	var pincode = $('input[name=pincode]').val();
	var address = $('input[name=address]').val();
	var obj ={
	  "fname":fname,
	  "lname":lname,
   	  "email":email,
   	  "password":password,
   	  "phonenumber":phonenumber,
   	  "pincode":pincode,
   	  "address":address
   }
   $.ajax({
       url: '/ec2demo/rest/services/doRegistration/registration',
       type: 'post',
       dataType: 'json',
       success: function (data) {
    	  console.log(data);
       },
       data: JSON.stringify(obj)
   });
});