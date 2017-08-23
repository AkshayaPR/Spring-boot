<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
<h2>Edit employee</h2>
<form action="/employee/update" method="post">
    <input type="hidden" name="id" value="${employee.id}">
    <table class="table table-bordered">
        <tbody>
        <tr><th>Name</th><td><input type="text" name="name" required="required" value="${employee.name}"></td></tr>
        <tr><th>City</th><td><input type="text" name="city" required="required" value="${employee.city}"></td></tr>
        <tr><td colspan="2"><input type="submit" value="Edit employee" class="btn btn-success"></tr>
        </tbody>
    </table>
</form>
<a href="/employee/index" class="btn btn-success">Back</a>

<script type="application/javascript" src="js/jquery.js"></script>
<script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>