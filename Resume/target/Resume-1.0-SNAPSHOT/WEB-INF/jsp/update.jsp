<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
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
        <h2>Update resume</h2>
    </div>
    <form role="form" class="form-horizontal" method="post">

        <div class="col-md-4">
            <input type="text" class="form-control" name="name" placeholder="${one_resume.names.name}">name<br>
            <input type="text" class="form-control" name="surename" placeholder="${one_resume.names.surename}">surename<br>
            <input type="text" class="form-control" name="middle_name" placeholder="${one_resume.names.middle_name}">middle name<br>
            <input type="text" class="form-control" name="birthday" placeholder="${one_resume.birthday}">birthday<br>
            <input type="text" class="form-control" name="phone" placeholder="${one_resume.contacts.phone}">phone<br>
            <input type="text" class="form-control" name="email" placeholder="${one_resume.contacts.email}">email<br>
            <input type="text" class="form-control" name="github" placeholder="${one_resume.contacts.github}">github<br>
            <input type="text" class="form-control" name="linkedin" placeholder="${one_resume.contacts.linkedin}">linkedin<br>
            <input type="text" class="form-control" name="skype" placeholder="${one_resume.contacts.skype}">skype<br>
            <input type="text" class="form-control" name="technology" placeholder="${one_resume.technology}">technology<br>
            <input type="text" class="form-control" placeholder="${one_resume.gender}" name="gender" list="gen">
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