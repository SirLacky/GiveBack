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
<hr>

<c:forEach items="${userDonations}" var="donations">
    Nazwa: <c:out value="${donations.name}"/> <br>
    Data odbioru:<br>
    <c:out value="${donations.pickUpDate}"/>
    <c:out value="${donations.pickUpHour}"/> <br>
    <b>Zakończona?</b> <c:out value="${donations.done}"/> <br>
    Adres odbioru: <br>
    <c:out value="${donations.pickUpCity}"/>
    <c:out value="${donations.pickUpStreet}"/>
    <c:out value="${donations.pickUpZIP}"/>
    <c:out value="${donations.pickUpPhoneNumber}"/> <br>
    Informacje dodatkowe:<br>
    Liczba worków:<c:out value="${donations.numberOfBags}"/> <br>
    <c:out value="${donations.pickUpObjectives}"/> <br>
    <a href="/mydonations/edit?id=${donations.id}">EDYTUJ DANE / ZATWIERDZ ODBIÓR</a>
    <hr>
</c:forEach>

</body>
</html>
