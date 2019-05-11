<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">
<head>
    <title>Strona Administracyjna</title>
</head>
<body>
<p sec:authorize="isAuthenticated()">
<p>Zalogowany jako: <span sec:authentication="name"></span></p>
<p>Posiada role: <span sec:authentication="authorities"></span></p>
</p>
<p sec:authorize-url="/admin/">
    Witaj na stronie Administracyjnej
</p>

</body>
</html>
