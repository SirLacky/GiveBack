<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Change User</title>
</head>
<body>
<h1> Edycja Użytkownika</h1>
<form:form modelAttribute="user" method="post">
    <form:errors path="*"/><br>
    <div class="form-group">
        <form:input path="username" type="email" name="email" placeholder="Email" />
    </div>
    <div class="form-group">
        <form:input path="firstName" type="text" name="imie" placeholder="imie" />
    </div>
    <div class="form-group">
        <form:input path="lastName" type="text" name="nazwisko" placeholder="nazwisko" />
    </div>
    <div>
    <button>ZAPISZ</button>
    </div>
</form:form><br>
<form action="/admin">
    <input type="submit" value="Powrót" />
</form>

</body>
</html>
