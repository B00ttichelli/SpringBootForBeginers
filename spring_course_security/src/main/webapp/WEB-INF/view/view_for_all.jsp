<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: platon
  Date: 25.08.2021
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>


</head>
<body>
<h2>Information For All Employee</h2>

<security:authorize access="hasRole('HR')">
<input type="button" value="salary" onclick="window.location.href  = 'hr_info'">
Only for HR staff

</security:authorize><br><br>

<security:authorize access="hasRole('MANAGER')">
<input type="button" value="performance" onclick="window.location.href  = 'manager_info'">
Only for Managers staff

</security:authorize>
</body>
</html>
