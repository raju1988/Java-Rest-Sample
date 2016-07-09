<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Login Page</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
	</head>
	<body>
		<div class='container'>
			<h2></h2>
		</div>
	    <div class="container col-sm-12">
	    	<div class="col-sm-3"></div>
	    	<div class="col-sm-6 form-group">
	    		<form role="form" class="form-horizontal" id='loginform' action="javascript:void('0');">
			        <div class='form-group col-sm-12'>
				        <div class="col-sm-3">
				        	<label for="inputEmail">Email address</label>
				       	</div>
				        <div class="col-sm-9">
				        	<input type="email" name="inputEmail" class="form-control" placeholder="Email address" required autofocus>
				        </div>
				    </div>
				    <div class='form-group col-sm-12'>
				        <div class="col-sm-3">
				        	<label for="inputPassword">Password</label>
				        </div>
				        <div class="col-sm-9">
				        	<input type="password" name="inputPassword" class="form-control" placeholder="Password" required>
				        </div>
				    </div>
				    <div class='form-group col-sm-12'>
				        <div class='col-sm-3'>
				        </div>
				        <div class='col-sm-9'>
					        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
					    </div>
					</div>
				</form>
			</div>
	    	<div class="col-sm-3"></div>
        </div> <!-- /container -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="./resources/js/demo.js"></script>
	    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
	</body>
</html>