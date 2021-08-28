<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: platon
  Date: 21.08.2021
  Time: 00:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee you are welcome !</h2>

<br>
<br>
<%--Your name: ${param.employeeName}--%>

Your name: ${employee.name}
<br>
Your Surname ${employee.surname}

<br>

Your Salary ${employee.salary}

<br>
Your Department ${employee.department}
<br>
Your Car Brand ${employee.carBrand}

<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>

</ul>

<br>
Phone NUmber ${employee.phoneNumber}

<br>
Email ${employee.email}
</body>
</html>
