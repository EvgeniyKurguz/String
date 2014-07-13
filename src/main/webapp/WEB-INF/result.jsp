<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:bundle basename="i18n.message">
    <html>
    <link rel="stylesheet" href="style/style.css" type="text/css">
    <head>
        <title><fmt:message key="title"/></title>
    </head>
    <body>
    <div align="center">

        <h3><fmt:message key="index.mytext"/></h3>

        <p>

        <h3><fmt:message key="by.symbol"/>:</h3>
        <textarea name="text" rows="30" cols="100">${parseToSymbols}</textarea>
        <br><br><br></p>

        <p><a href="http://localhost:8088/">Back</a></p>

        <p>
                ${param.text}
        </p>
    </div>
    </body>
    </html>
</fmt:bundle>