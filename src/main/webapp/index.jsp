<jsp:useBean id="numberOfTries" scope="request" type="com.quest.LogicServlet"/>

<jsp:useBean id="name" scope="request" type="com.quest.LogicServlet"/>

<%--<%@ page import="com.quest.Sign" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Tic-Tac-Toe</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h1>Tic-Tac-Toe</h1>
Привет !
        <div style="border: black 1px solid" >${name}</div>
        <div style="border: black 1px solid" >${numberOfTries}</div>




    <button onclick="restart()">Start again</button>

<script>
    function restart() {
        $.ajax({
            url: '/restart',
            type: 'POST',
            contentType: 'application/json;charset=UTF-8',
            async: false,
            success: function () {
                location.reload();
            }
        });
    }
</script>

</body>
</html>