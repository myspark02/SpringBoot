<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Spring Boot </title>
</head>
<body> 
    <h1>Login</h1>
    ${SPRING_SECURITY_LAST_EXCEPTION.message}
    <form action="login" method="post">
        <table>
            <tr>
                <td>User:</td>
                <td><input type="text" name="username" value=""></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" value=""></td>
            </tr>     
            <tr>
                <td><input type="submit" value="submit"></td>
            </tr>   
        </table>            
    </form> 
</body>
</html>
