<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <strong style="margin-bottom: 0.25em; display: block; width: 250px"
      >Room Reservations for B10</strong
    >
    <table style="border: 1px solid">
      <thead>
     	<tr>
        <th></th>
        <th>Mon</th>
        <th>Tue</th>
        <th>Wed</th>
        <th>Thr</th>
        <th>Fri</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>08:00-9:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>9:00-10:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>10:00-11:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>11:00-12:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>12:00-13:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>13:00-14:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>14:00-15:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>15:00-16:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        <tr>
          <td>16:00-17:00</td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      </tbody>
    </table>
    <form action="homePage" method="post">
    <select name="dayOfWeek">
      <option value="Mon">Mon</option>
      <option value="Tue">Tue</option>
      <option value="Wed">Wed</option>
      <option value="Thur">Thur</option>
      <option value="Fri">Fri</option>
    </select>
    <select name="timeSlot">
    	<option value="1">08:00-9:00</option>
    	<option value="2">9:00-10:00</option>
    	<option value="3">10:00-11:00</option>
    	<option value="4">11:00-12:00</option>
    	<option value="5">12:00-13:00</option>
    	<option value="6">13:00-14:00</option>
    	<option value="7">14:00-15:00</option>
    	<option value="8">15:00-16:00</option>
    	<option value="9">16:00-17:00</option>
    </select>
    <input type="text" name="name"></input>
    <input type="submit" value="Reserve">
    </form>
  </body>
</html>