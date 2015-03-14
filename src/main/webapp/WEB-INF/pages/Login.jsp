<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Contacts Information</h2>
<form:form method="POST" commandName="login" action="/SpringMVCHelloWorld/veriyLogin">
   <table>
    <tr>
        <td><form:label path="userName">User Name</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="Password">Password</form:label></td>
        <td><form:input path="Password" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>