<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <title>Please Login</title>

    <link rel="stylesheet" href="/css/style.css">
</head>
<body id="login">

    <h3>Administration mode</h3>
    <form method="post" action="/login">
        <div class="form-group">
            <label for="username">Login (admin)</label>
            <input class="form-control" type="text" id="username" placeholder="Enter your Login"
                   name="username">
        </div>
        <div class="form-group">
            <label for="password">Password (admin)</label>
            <input class="form-control" type="password" id="password" placeholder="Enter your password"
                   name="password">
        </div>
        <button type="submit" class="btn btn-primary">Enter</button>
        <a href="<c:url value="/home"/>">return to main menu</a>
    </form>
</div>
</body>
</html>