<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Add Employee Info</h2>
<br>
<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id" />

    Name<form:input path="name"></form:input>
    <br>
    Surname<form:input path="surname"></form:input>
    <br>
    Department<form:input path="department"></form:input>
    <br>
    Salary<form:input path="salary"></form:input>
<br>
    <br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
