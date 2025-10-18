<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="no">
<head>
    <meta charset="UTF-8" />
    <title>Påmeldingsbekreftelse</title>
    <link rel="stylesheet" href="<c:url value='/css/simple.css'/>" />
</head>
<body>
<h2>Påmeldingsbekreftelse</h2>
<p>Påmeldingen er mottatt for</p>
<p>
    &nbsp;&nbsp;&nbsp;<c:out value="${deltager.fornavn}"/><br/>
    &nbsp;&nbsp;&nbsp;<c:out value="${deltager.etternavn}"/><br/>
    &nbsp;&nbsp;&nbsp;<c:out value="${deltager.mobilnr}"/><br/>
    &nbsp;&nbsp;&nbsp;<c:out value="${deltager.kjonn}"/>
</p>
<a href="<c:url value='/deltagerliste'/>">Gå til deltagerlisten</a>
</body>
</html>