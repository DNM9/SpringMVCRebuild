<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 02/12/2019
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>

    <style>
        .error {color:red}
    </style>

</head>
<body>

    <form:form action="processForm" modelAttribute="customer">

        <i>Fill out the form. Asteriks (*) means required. </i>

        <br><br>

        First Name: <form:input path="firstName" />
        <form:errors path="firstName" cssClass="error" />

        <br><br>

        Last Name (*): <form:input path="lastName" />
        <form:errors path="lastName" cssClass="error" />

        <br><br>

        <input type="submit" value="Submit"/>

    </form:form>

</body>
</html>
