<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:bundle basename="i18n.message">
    <html>
    <link rel="stylesheet" href="style/style.css" type="text/css">
    <head>
        <title></title>
    </head>
    <body>
    <div style="width:1020px;">

        <h3><fmt:message key="index.mytext"/></h3>
        <p>
        <h3><fmt:message key="by.symbol"/>:</h3>
        <textarea name="text" rows="20" cols="100">${parseToSymbols}</textarea>
        <br><br><br>
       <p><a  href="http://localhost:8088/" >Back</a></p>
        <p>
                ${param.text}
        </p>
    </div>
    </body>
    </html>
</fmt:bundle>