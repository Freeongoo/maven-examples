<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP</h1>

    <h2>Time</h2>
    <jsp:useBean id = "date" class = "java.util.Date" />
    <p>The date/time is <%= date %>

    <h2>Cat</h2>

    <jsp:useBean id = "cat" class = "simple.beans.Cat">
        <jsp:setProperty name = "cat" property = "name" value = "Dusya"/>
        <jsp:setProperty name = "cat" property = "age" value = "3"/>
    </jsp:useBean>

    <p>Cat Name:
        <jsp:getProperty name = "cat" property = "name"/>
    </p>

    <p>Cat Age:
        <jsp:getProperty name = "cat" property = "age"/>
    </p>
</body>
</html>
