<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>HomePage</title>
</head>
<body>
  <div class="container pt-3">
    <div>
	  <form action='HomePage' method='post'>
	    <a class="btn btn-primary" href='ListStudents' id='students'>Students</a>
	    <a class="btn btn-primary" href='ListGroups' id='groups'>Groups</a>
	  </form>
	</div>
  </div>
</body>
</html>