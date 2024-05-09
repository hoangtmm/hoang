<%-- 
    Document   : home
    Created on : Mar 31, 2024, 11:16:15 AM
    Author     : Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User: Home</h1>
    <c:if test="${not empty userobj}">
        <h1>Name: ${userobj.name}</h1>
        <h1>Email: ${userobj.email}</h1>


    </c:if>
</body>
</html>
