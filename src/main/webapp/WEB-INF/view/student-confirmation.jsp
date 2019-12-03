<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 01/12/2019
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Student Form</title>
</head>

<body>


The Student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

City: ${student.city}

<br><br>

Favorite Programming Language: ${student.programmingLanguage}

<br><br>

Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
    <li> ${temp} </li>
    </c:forEach>
</ul>

</body>

</html>
