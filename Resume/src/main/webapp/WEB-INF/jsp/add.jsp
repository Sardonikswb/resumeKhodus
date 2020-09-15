<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
          integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="container">
        <h3>Add resume</h3>
    <form role="form" class="form-horizontal" method="post">
        <div class="row">
            <div class="col-md-5">
                <input type="text" class="form-control" name="name" required placeholder="Enter name">name<br>
                <input type="text" class="form-control" name="surename" required
                       placeholder="Enter surename">surename<br>
                <input type="text" class="form-control" name="middle_name" placeholder="Enter middle name">middle
                name<br>
                <input type="date" class="form-control" name="birthday" required
                       placeholder="Enter birthday">birthday<br>
                <input type="tel" class="form-control" name="phone" required placeholder="Enter phone">phone<br>
                <input type="email" class="form-control" name="email" placeholder="Enter email">email<br>
                <input type="text" class="form-control" name="github" placeholder="Enter github">github<br>
            </div>
            <div class="col-md-5">
                <input type="text" class="form-control" name="linkedin" placeholder="Enter linkedin">linkedin<br>
                <input type="text" class="form-control" name="skype" placeholder="Enter Skype">skype<br>
                <input type="text" class="form-control" placeholder="gender" required name="gender" list="gen">
                <datalist id="gen">
                    <option value="мужчина"></option>
                    <option value="женщина"></option>
                </datalist>
                <br>
                <p>Technologies</p>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="Git" id="Git" name="Git">
                    <label class="form-check-label" for="Git"> Git </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="HTML" id="HTML" name="HTML">
                    <label class="form-check-label" for="HTML"> HTML </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="JavaEE" id="JavaEE" name="JavaEE">
                    <label class="form-check-label" for="JavaEE"> Java EE </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="Java Core" id="Java Core" name="Java Core">
                    <label class="form-check-label" for="Java Core"> Java Core </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="Spring Boot" id="Spring Boot"
                           name="Spring Boot">
                    <label class="form-check-label" for="Spring Boot"> Spring Boot </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="Spring" id="Spring" name="Spring">
                    <label class="form-check-label" for="Spring"> Spring </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="Maven" id="Maven" name="Maven">
                    <label class="form-check-label" for="Maven"> Maven </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="REST" id="REST" name="REST">
                    <label class="form-check-label" for="REST"> REST </label>
                </div>

            </div>
        </div>
        <button type="submit" class="btn btn-success">confirm</button>
    </form>
    <form action="${pageContext.request.contextPath}/home">
        <button type="submit" class="btn btn-danger">cancel</button>
    </form>
</div>
</body>
</html>
