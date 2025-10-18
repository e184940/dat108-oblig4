<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="no">
<head>
    <meta charset="UTF-8" />
    <title>Deltagerliste</title>
    <link rel="stylesheet" href="<c:url value='/css/simple.css'/>" />
</head>
<body>
<h2>Deltagerliste</h2>
<table>
    <tr>
        <th>Kjønn</th>
        <th align="left">Navn</th>
        <th align="left">Mobil</th>
    </tr>
    <c:forEach var="d" items="${deltagere}">
        <tr>
            <td align="center">
                <c:choose>
                    <c:when test="${d.kjonn eq 'Kvinne'}">&#9792;</c:when>
                    <c:otherwise>&#9794;</c:otherwise>
                </c:choose>
            </td>
            <td><c:out value="${d.navn}"/></td>
            <td><c:out value="${d.mobilnr}"/></td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value='/paamelding'/>">Tilbake til påmelding</a>
</body>
</html>