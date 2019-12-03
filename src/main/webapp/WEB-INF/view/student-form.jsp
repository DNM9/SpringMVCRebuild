<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 01/12/2019
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>StudentForm</title>
</head>

<body>


    <form:form action="processForm" modelAttribute="student">

        First Name: <form:input path="firstName" />

        <br><br>

        Last Name: <form:input path="lastName" />

        <br><br>

        Country: <form:select path="country">

            <form:options items="${student.countryOptions}" />

        </form:select>

        <br><br>

        City: <form:select path="city">
            <form:options items="${theCityOptions}"/>
        </form:select>

        <br><br>
        Favorite Programming Languages:
        <form:radiobuttons path="programmingLanguage" items="${student.programmingLanguageOptions}"/>

        <br><br>

        Operating Systems:
        Linux: <form:checkbox path="operatingSystems" value="Linux"/>
        MacOS: <form:checkbox path="operatingSystems" value="MacOS"/>
        MS Windows: <form:checkbox path="operatingSystems" value="MS Windows"/>

        <br><br>

        <input type="submit" value="Submit"/>

    </form:form>



</body>

</html>
