<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>On this page you can set Donation as Done</title>
</head>
<body>
<h1> Change donation status:</h1>
<hr>
<form:form method="post" modelAttribute="donation">
    <form:errors path="*"/><br>
    Nazwa donacji: <form:input path="name"/><br>
    <hr>
    Data odbioru:
    <form:input path="pickUpDate"/>
    <form:input path="pickUpHour"/>
    <hr>
    Adres odbioru:
    <form:input path="pickUpCity"/>
    <form:input path="pickUpStreet"/>
    <form:input path="pickUpZIP"/>
    <form:input path="pickUpPhoneNumber"/>
    <hr>
    Liczba worków:<form:input path="numberOfBags"/>
    <hr>
    UWAGI:
    <form:input path="pickUpObjectives"/>
    <br>
    Czy donacja została zabrana:<br>
    <br><hr>
    <form:select path="done">
        <form:option value="true">Donacja zabrana</form:option>
        <form:option value="false">Donacja nie zabrana</form:option>
    </form:select>
    <br>
    <button>ZAPISZ</button>
</form:form>
<hr>
<form action="/mydonations">
    <input type="submit" value="ANULUJ" />
</form>
</body>
</html>
