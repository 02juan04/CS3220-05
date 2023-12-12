<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<div>
	  <nav aria-label="breadcrumb">
  	    <ol class="breadcrumb">
    	  <li class="breadcrumb-item"><a href="HomePage">Home</a></li>
    	  <li class="breadcrumb-item active" aria-current="page">Students</li>
  	    </ol>
      </nav>
	</div>
	<hr></hr>
	<a href='NewStudent'>New Student</a>
	<table class="table table-striped table-bordered table-sm table-hover">
		<tr>
			<th scope="col">Student</th>
			<th scope="col">Age</th>
			<th scope="col">Parent</th>
			<th scope="col">Email</th>
			<th scope="col">Group</th>
			<th></th>
		</tr>
		  <c:forEach var="student" items="${studentList}">
		  <tr>
			<td><c:out value="${student.name}" /></td>
			<td><c:out value="${student.age}" /></td>
			<td><c:out value="${student.parent}" /></td>
			<td><c:out value="${student.email}" /></td>
			<td><c:out value="${student.group}" /></td>
			<td><a class="btn btn-secondary btn-sm" href="editStudent?studentID=${student.id}">Edit</a></td>
		  <tr>
		  </c:forEach>
	</table>
	</div>
</body>
</html>
