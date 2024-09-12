<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2024-09-12
  Time: 오후 7:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <li>${dto.tno}</li>
        <li>${dto.title}</li>
        <li>${dto.dueDate}</li>
        <li>${dto.finished}</li>
    </ul>
</body>
</html>
