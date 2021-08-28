<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: platon
  Date: 21.08.2021
  Time: 00:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee please enter your name !</h2>
<br>
<br>
<form:form action="showDetail" modelAttribute="employee">
    Name  <form:input path="name"></form:input> <form:errors path="name"></form:errors>
    <br>
    <br>
    Surname <form:input path="surname"></form:input><form:errors path="surname"></form:errors>
    <br>
    <br>
    Salary <form:input path="salary"></form:input><form:errors path="salary"></form:errors>
    <br>
    <br>

    Department <form:select path="department">
    <form:options items="${employee.departments}"></form:options>

</form:select>

    <br>
    <br>
    <br>
<form:radiobuttons path="carBrand" items="${employee.carBrands}"></form:radiobuttons>
    <br>
    <br>
    Foreign language(s) ?
    <form:checkboxes path="languages" items="${employee.languageList}"></form:checkboxes>
    <br>
    <br>
    Phone Number <form:input path="phoneNumber"></form:input><form:errors path="phoneNumber"></form:errors>
    <br><br>
    Email <form:input path="email"></form:input><form:errors path="email"></form:errors>
    <br><br>
    <input type="submit" name="OK">
</form:form>

</body>
</html>
