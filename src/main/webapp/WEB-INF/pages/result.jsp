<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Contacts Information</h2>
   <table>
    <tr>
        <td>FirstName</td>
        <td>${firstName}</td>
    </tr>
    <tr>
        <td>LastName</td>
        <td>${lastName}</td>
    </tr>
    <tr>
        <td>ContactID</td>
        <td>${contactID}</td>
    </tr>
    <tr>
        <td>EmailID</td>
        <td>${email}</td>
    </tr>
    <tr>
        <td>Phone</td>
        <td>${phone}</td>
    </tr>
</table>  
</body>
</html>