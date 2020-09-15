<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="container">
        <h3>Are you really want to delete this mobile?</h3>
    <form role="form" class="form-horizontal" method="post">
        <div>
            <p><%=request.getParameter("model")%>
            </p>
            <button type="submit" class="btn btn-danger">delete mobile</button>
        </div>
    </form>
    <form action="${pageContext.request.contextPath}/homeAdmin" class="form-horizontal">
        <button type="submit" class="btn btn">cancel</button>
    </form>
</div>
</body>
</html>
