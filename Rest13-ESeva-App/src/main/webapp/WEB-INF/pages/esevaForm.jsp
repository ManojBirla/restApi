<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form  method="POST" action="add.htm" modelAttribute="cmd">
   
     Nasme::<form:input path="name"/><br>
     Addrs::<form:input path="addrs"/><br>
     birthCertificate No.::<form:input path="bcNo"/><br>
     Dob::<form:input path="dob"/><br>
     <input type="submit" value="register">

</form:form>
<h1 style="color:red" >"hello "+${Msg}</h1>


