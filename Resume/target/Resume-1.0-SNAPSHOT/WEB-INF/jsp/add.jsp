<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD</title>
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

</head>
<body>

<div class="container">
    <div class="col-md-4">
        <h2>Add resume</h2>
    </div>
    <form role="form" class="form-horizontal" method="post">

        <div class="col-md-5">
            <input type="text" class="form-control" name="name" required placeholder="Enter name">name<br>
            <input type="text" class="form-control" name="surename" required placeholder="Enter surename">surename<br>
            <input type="text" class="form-control" name="middle_name" placeholder="Enter middle name">middle name<br>
            <input type="text" class="form-control" name="birthday" required placeholder="Enter birthday">birthday<br>
            <input type="text" class="form-control" name="phone" required placeholder="Enter phone">phone<br>
            <input type="text" class="form-control" name="email" placeholder="Enter email">email<br>
            <input type="text" class="form-control" name="github" placeholder="Enter github">github<br>
            <input type="text" class="form-control" name="linkedin" placeholder="Enter linkedin">linkedin<br>
            <input type="text" class="form-control" name="skype" placeholder="Enter Skype">skype<br>
            <input type="text" class="form-control" name="technology" placeholder="Enter technology">technology<br>
            <input type="text" class="form-control" placeholder="gender" required name="gender" list="gen">
            <datalist id="gen">
                <option value="мужчина"></option>
                <option value="женщина"></option>
            </datalist>
            <button type="submit" class="btn btn-success">confirm</button>
        </div>
    </form>
    <form action="${pageContext.request.contextPath}/home">
        <button type="submit" class="btn btn-danger">cancel</button>
    </form>
</div>
</body>
</html>
