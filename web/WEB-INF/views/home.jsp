<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\7\7 0007
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<sf:form  method="post" modelAttribute="student" action="/register">
    Stu_id:<sf:input path="stuId" />
    <sf:errors path="stuId"/> <br/>
    Stu_name:<sf:input path="stuName"/>
    <sf:errors path="stuName"/> <br/>
    Stu_city:<sf:input path="stuCity"/>
    <sf:errors path="stuCity"/> <b/>
    <input type="submit" value="Register"/>

</sf:form>

</body>
</html>
