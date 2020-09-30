<%-- 
    Document   : editjsp
    Created on : Sep 29, 2020, 7:51:48 PM
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
        <h2>Edit Note</h2>
        <form method="post" action="Note">
        <p><b>Title:</b><input type="text" name="title" value="${Note.title}"> </p>
        <p><b>Contents:</b> <br> <input type="text" name="content" value="${Note.content}"> </p>
        <input type="submit" value="Save">
        </form>
    </body>
</html>
