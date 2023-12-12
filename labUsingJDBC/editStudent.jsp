<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Edit Student</title>
</head>
<body>
<div class="container">
	<form action='editStudent' method='post'>
	<input type="hidden" value="${student.id}" name="studentID">
	<div>
	  <nav aria-label="breadcrumb">
  	    <ol class="breadcrumb">
    	  <li class="breadcrumb-item"><a href="HomePage">Home</a></li>
    	  <li class="breadcrumb-item"><a href="ListStudents">Students</a></li>
    	  <li class="breadcrumb-item active" aria-current="page">Edit Student</li>
  	    </ol>
      </nav>
	</div>
	<hr></hr>
	<table class="table table-sm table-striped table-hover table-bordered">
		<tr>
			<th>Name</th>
			<td><input class="form-control" type='text' name='name' value="${student.name}"></td>
		</tr>
		<tr>
			<th>Birth Year</th>
			<td><input class="form-control" type='text' name='birthYear' value="${student.birthYear}"></td>
		</tr>
		<tr>
			<th>Parent Name</th>
			<td><input class="form-control" type='text' name='parentName' value="${student.parent}"></td>
		</tr>
		<tr>
			<th>Parent Email</th>
			<td><input class="form-control" type='email' name='parentEmail' value="${student.email}"></td>
		</tr>
		<tr>
			<th>Group</th>
			<td>
				<select  class="form-select form-select-sm" name='groupSelect'>
				  <c:forEach var="group" items="${ groups }">
					<option value="${group.groupName}"><c:out value="${group.groupName}"></c:out></option>
				  </c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td colspan=4>
			<input type='submit' value='save'>
			</td>
		</tr>
		</table>
		</form>
	</div>
</body>
</html>