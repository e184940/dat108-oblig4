<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="no">
<head>
    <meta charset="UTF-8" />
    <title>Påmelding</title>
    <link rel="stylesheet" href="<c:url value='/simple.css'/>" />
</head>
<body>
<h2>Påmelding</h2>

<c:if test="${not empty org.springframework.validation.BindingResult.bruker && org.springframework.validation.BindingResult.bruker.hasErrors()}">
    <p style="color:red;">Påmeldingsdetaljer er ugyldige. Rett feltene under.</p>
</c:if>

<form:form id="regForm" method="post" action="<c:url value='/paameldt'/>" modelAttribute="bruker" novalidate="novalidate">
    <label>Fornavn
        <form:input path="fornavn" required="required" minlength="2" maxlength="50" />
        <form:errors path="fornavn" cssStyle="color:red;" />
    </label>

    <label>Etternavn
        <form:input path="etternavn" required="required" minlength="2" maxlength="50" />
        <form:errors path="etternavn" cssStyle="color:red;" />
    </label>

    <label>Mobil
        <form:input path="mobilnr" type="tel" required="required" pattern="[0-9 ]{8,20}" />
        <form:errors path="mobilnr" cssStyle="color:red;" />
    </label>

    <label>Passord
        <form:password path="passord1" required="required" minlength="8" />
        <form:errors path="passord1" cssStyle="color:red;" />
    </label>

    <label>Gjenta passord
        <form:password path="passord2" required="required" minlength="8" />
        <form:errors path="passord2" cssStyle="color:red;" />
    </label>

    <div>
        <label>
            <form:radiobutton path="kjonn" value="Mann" /> Mann
        </label>
        <label>
            <form:radiobutton path="kjonn" value="Kvinne" /> Kvinne
        </label>
        <form:errors path="kjonn" cssStyle="color:red;" />
    </div>

    <button type="submit" id="submitBtn">Meld meg på</button>
</form:form>
</body>
</html>