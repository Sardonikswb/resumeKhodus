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
    <title>user</title>
    <link rel="stylesheet" href="/css/style.css">
   </head>
<body id="imgHomePage">
<div class="container">
           <h3>Model of mobiles</h3>

    <div class="row">
        <div class="col-md-3">
            <div class="container">
                <div class="col-8">
                    <form method="get" action="${pageContext.request.contextPath}/home">
                        <input type="text" name="modelSearch" placeholder="Enter model"><br>
                        <button class="btn btn-secondary form-control" type="submit">find mobile</button>
                    </form>
                    <div class="btn-group" role="group">
                        <form method="get" action="${pageContext.request.contextPath}/home">
                            <input type="submit" style="color: black" value="sort by id"
                                   class="btn btn-outline-secondary form-control">
                            <input type="submit" value="sort by model" style="color: black"
                                   class="btn btn-outline-secondary form-control"
                                   name="Sort">
                            <input type="submit" value="sort by cost ASC" style="color: black"
                                   class="btn btn-outline-secondary form-control"
                                   name="Sort">
                            <input type="submit" value="sort by cost DESC" style="color: black"
                                   class="btn btn-outline-secondary form-control"
                                   name="Sort">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="col">
            <table class="table table-striped table-bordered col-md-4 semilayer table-hover">
                <thead>
                <tr class="active">
                    <th>id</th>
                    <th> Model</th>
                    <th>Cost</th>
                </tr>
                </thead>
                <c:forEach items="${mobilesList}" var="mobile">
                    <tr>
                        <td>${mobile.getId()}</td>
                        <td>${mobile.getModel()}</td>
                        <td>${mobile.getCost()}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="col-md-3" >
            <div class="button btn-lg"><a href="/homeAdmin" style="color: black">Administration mode</a></div>
        </div>
    </div>
</div>
</body>
</html>
