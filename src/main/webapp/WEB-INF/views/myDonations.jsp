<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Moje zbiórki</title>
</head>
<body>
<h1>Moje zbiórki:</h1>

<c:forEach items="${userDonations}" var="donations">
    Nazwa: <c:out value="${donations.name}"/> <br>
    <a href="#">EDYTUJ</a>
    <hr>
</c:forEach>

    <hr>

</body>
</html>
