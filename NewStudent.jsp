<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
  <div class="container">
	<form action='NewStudent' method='post'>
	<div>
	  <nav aria-label="breadcrumb">
  	    <ol class="breadcrumb">
    	  <li class="breadcrumb-item"><a href="HomePage">Home</a></li>
    	  <li class="breadcrumb-item"><a href="ListStudents">Students</a></li>
    	  <li class="breadcrumb-item active" aria-current="page">New Student</li>
  	    </ol>
      </nav>
	</div>
	<hr></hr>
	<table class="table table-bordered table-sm table-striped table-hover">
		<tr>
			<th>Name</th>
			<td><input class="form-control" type='text' name='name' placeholder="John Doe"></td>
		</tr>
		<tr>
			<th>Birth Year</th>
			<td><input class="form-control" type='text' placeholder="yyyy" name='birthYear'></td>
		</tr>
		<tr>
			<th>Parent Name</th>
			<td><input class="form-control" type='text' name='parentName' placeholder="Jane Doe"></td>
		</tr>
		<tr>
			<th>Parent Email</th>
			<td><input class="form-control" type='email' name='parentEmail' placeholder="email@email.com"></td>
		</tr>
		<tr>
			<th>Group</th>
			<td>
				<select name='groupSelect' class="form-select form-select-sm">
				  <c:forEach var="group" items="${ groups }">
					<option value="${group.groupName}"><c:out value="${group.groupName}"></c:out></option>
				  </c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan=4>
			<input class="btn btn-primary" type='submit' value='add'>
			</td>
		</tr>
		</table>
		</form>
  </div>
</body>
</html>