<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>New Group</title>
</head>
<body>
<div class="container">
	<div>
	  <nav aria-label="breadcrumb">
  	    <ol class="breadcrumb">
    	  <li class="breadcrumb-item"><a href="HomePage">Home</a></li>
    	  <li class="breadcrumb-item"><a href="ListGroups">Groups</a></li>
    	  <li class="breadcrumb-item active" aria-current="page">Add Group</li>
  	    </ol>
      </nav>
	</div>
	<form action='NewGroup' method='post'>
	<table class="table table-striped table-bordered table-hover table-sm">
	  <tr>
		<th>Group</th>
		<td><input type="text" name="group"></td>
	  </tr>
	  <tr>
		<td colspan=4>
			<input class="btn btn-primary btn-sm" type='submit' value='add'>
		</td>
	  </tr>
	</table>
	</form>
</div>
</body>
</html>