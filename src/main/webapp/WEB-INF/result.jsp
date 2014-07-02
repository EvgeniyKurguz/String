<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<fmt:bundle basename="i18n.messages">
    <html>
    <head>
        <title></title>
    </head>
    <body>
    <div style="width:1020px;">

        <h3><fmt:message key="index.mytext"/></h3>
        <h3><a href="input.txt">back</a> </h3>
        <p>
                ${param.text}
        </p>
    </div>
    </body>
    </html>
</fmt:bundle>