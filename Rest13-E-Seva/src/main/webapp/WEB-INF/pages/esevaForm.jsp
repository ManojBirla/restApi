<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="add.htm" method="Post" modelAttribute="esevaCmd">
   
     Name::<form:input path="name"/>
     Addrs::<form:input path="addrs"/>
     birthCertificate No.::<form:input path="bcNo"/>
     Dob::<form:input path="dob"/>
     <input type="submit" value="register">

</form:form>

<h1>Result is::${Msg}</h1>
 </body>
 
 
</html>