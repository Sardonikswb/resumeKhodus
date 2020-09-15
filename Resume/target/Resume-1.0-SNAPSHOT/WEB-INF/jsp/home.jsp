<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>

    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <title>home</title>
    <style>
        body {
            background-image: url(/img/home.jpg);
            background-size: 100%;

        }

        .semilayer {
            padding: 5px; /* Поля вокруг текста */
            background: #fbfffb; /*!* Цвет фона *!*/
            margin: 0 auto; /*!* Выравниваем слой по центру *!*/
            width: 100%; /*!* Ширина слоя *!*/
            opacity: 1; /*!* Значение прозрачности *!*/
            filter: alpha(Opacity=90);
        }
    </style>
</head>
<body>
<div class="container">
    <div align="center" style="color: black">
        <h3>List of Resume</h3>
    </div>

    <div class="col-md-3">
        <form method="get" action="${pageContext.request.contextPath}/home">
            <input type="text" name="name" placeholder="Enter"><br>
            <button class="btn btn-boring" type="submit">find name</button>
        </form>
        <a href="${pageContext.request.contextPath}/add" class="btn btn-primary col-md-9" role="button">add
            resume</a>
    </div>
    <p></p>
    <table class="table table-striped table-sm table-bordered semilayer table-hover">
        <thead>
        <tr class="active">
            <th></th>
            <th>delete</th>
            <th>Name</th>
            <th>Surename</th>
            <th>Middle name</th>
            <th>Birthday</th>
            <th>phone</th>
            <th>email</th>
            <th>github</th>
            <th>linkedin</th>
            <th>skype</th>
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
                    <form method="get" action="${pageContext.request.contextPath}/home?id=delete">
                        <input type="submit" value="${resume.id}" style="color: black"
                               class="btn btn-outline-secondary form-control"
                               name="delete"></form>
                </td>
                <td>${resume.names.name}</td>
                <td>${resume.names.surename}</td>
                <td>${resume.names.middle_name}</td>
                <td>${resume.birthday}</td>
                <td>${resume.contacts.phone}</td>
                <td>${resume.contacts.email}</td>
                <td>${resume.contacts.github}</td>
                <td>${resume.contacts.linkedin}</td>
                <td>${resume.contacts.skype}</td>
                <td>${resume.gender}</td>
                <td>${resume.technology}</td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
