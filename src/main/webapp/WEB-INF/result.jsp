<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:bundle basename="i18n.message">
    <html>
    <head>
        <title></title>
    </head>
    <body>
    <div style="width:1020px;">

        <h3><fmt:message key="index.mytext"/></h3>
        <p><a  href="http://localhost:8088/" >Back</a></p>
        <p>
                ${param.text}
        </p>
    </div>
    </body>
    </html>
</fmt:bundle>