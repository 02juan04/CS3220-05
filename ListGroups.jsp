<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<div>
	<nav aria-label="breadcrumb">
  	  <ol class="breadcrumb">
    	<li class="breadcrumb-item"><a href="HomePage">Home</a></li>
    	<li class="breadcrumb-item active" aria-current="page">Groups</li>
  	</ol>
</nav>
	  </div>
	  <hr></hr>
	  <a href='NewGroup'>New Group</a>
	  <table class="table table-bordered table-sm table-striped table-hover">
	    <tr>
		  <th scope="col">Group</th>
		  <th scope="col">Members</th>
	    </tr>
	    <c:forEach var="group" items="${groups}">
	      <tr>
		    <td>
		  	  <c:out value="${ group.groupName }"/>
		    </td>
		    <td>
		      <c:forEach var="members" items="${group.members}">
		        <c:out value="${members.name}"></c:out> |
		      </c:forEach>
		    </td>
	      </tr>
	    </c:forEach>
	  </table>
	</div>
</body>
</html>