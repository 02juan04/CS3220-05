<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="DrivingTestBrowser" method="post">
		<p>${questionIndex}</p>
		<p>${currentQuestion.getDescription()}</p>
	<ol>
		<li>${currentQuestion.getAnswerA()}</li>
		<li>${currentQuestion.getAnswerB()}</li>
		<li>${currentQuestion.getAnswerC()}</li>
	</ol>
	<p>Correct Answer: ${currentQuestion.getCorrectAnswer()}</p>
    <input type="submit" value="Next">
</form>
</body>
</html>