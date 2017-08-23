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
    <h2>List of Employees</h2>
    <table class="table table-bordered">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>City</th>            
            <th>Action</th>
        </tr>
        <tbody>
            <c:forEach items="${employees}" var="employee" varStatus="itr">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.city}</td>
                    <td><a href="/employee/edit/${employee.id}" class="btn btn-warning">Edit</a> </td>
                     <td><a href="/employee/delete/${employee.id}" class="btn btn-warning">Delete</a> </td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
    <a href="/employee/create" class="btn btn-success">Add Employee</a>

    <script type="application/javascript" src="js/jquery.js"></script>
    <script type="application/javascript" src="js/bootstrap.js"></script>


</body>
</html>