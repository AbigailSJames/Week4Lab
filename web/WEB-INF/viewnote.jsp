<%-- 
    Document   : viewnote
    Created on : Sep 29, 2020, 7:51:33 PM
    Author     : 818736
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p><b>Title:</b> ${Note.title} </p>
        <p><b>Contents:</b> <br> ${Note.content}</p>
        <a href="Note?edit=edit"> Edit </a>

    </body>
</html>
