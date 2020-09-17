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
    <title>home</title>

    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/script.js"></script>
</head>
<body id="imgHomePage">
<div class="container">

    <h3>List of Resume</h3>

    <div class="col-md-3">
        <form method="get" action="${pageContext.request.contextPath}/home">
            <input type="text" name="name" placeholder="Enter"><br>
            <button class="btn btn-boring" type="submit">find name</button>
        </form>
        <a href="${pageContext.request.contextPath}/add" class="btn btn-primary col-md-9" role="button">add
            resume</a>
    </div>
    <br>
    <table class="table table-striped table-sm table-bordered semilayer table-hover">
        <thead>
        <tr class="active">
            <th></th>
            <th>id/delete</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>contacts</th>
            <th>Gender</th>
            <th>Technology</th>
        </tr>
        </thead>
        <c:forEach items="${resumeList}" var="resume">
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/update?idResume=${resume.id}&idNames=${resume.idNames}&idContacts=${resume.idContacts}">update</a>
                </td>
                <td>
                    <form method="post" action="${pageContext.request.contextPath}/home">
                        <input type="submit" value="${resume.id}" style="color: black"
                               class="btn btn-outline-secondary form-control"
                               name="delete" id="delete${resume.id}" onclick=result(${resume.id})></form>
                </td>
                <td>${resume.names}</td>
                <td>${resume.birthday}</td>
                <td>${resume.contacts}</td>
                <td>${resume.gender}</td>
                <td>${resume.technology}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<footer>
    <div class="container">
        <p class="float-right">
            <a href="#">Back to top</a>
        </p>
        <b>Проект разработан с применением технологий SPRING. База данных - PostgresSQL. Визуальная часть - JSP. Простые
            тесты. </b>
    </div>
</footer>
</body>
</html>
