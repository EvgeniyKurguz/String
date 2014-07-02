<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:bundle basename="i18n.messages">
    <html>
    <head>
          <title><fmt:message key="title"/></title>
    </head>
    <body>
    <div>
        <form action="${pageContext.request.contextPath}/controller" method="post">
            <p><fmt:message key="index.input.text"/></p>

            <p><textarea name="text" rows="40" cols="90"> <%@include file="WEB-INF/input.txt" %>
            </textarea></p>

            <p><input type="submit" value="<fmt:message key="index.submit" />"/></p>
        </form>
    </div>
    </body>
    </html>
</fmt:bundle>