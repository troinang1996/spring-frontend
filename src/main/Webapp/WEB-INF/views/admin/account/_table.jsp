<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title"> DANH SÁCH THÀNH VIÊN  ${msg}</h4>

    </div>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>PassWord</th>
            <th>FullName</th>
            <th>Email</th>
            <th>Photo</th>
            <th>Activated</th>
            <th>Admin</th>
            <th></th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="k" items="${users}">
            <tr>
                <td>${k.id}</td>
                <td>${k.passWord}</td>
                <td>${k.fullName}</td>
                <td>${k.email}</td>
                <td>${k.photo}</td>
                <td>${k.activated}</td>
                <td>${k.admin}</td>
                <td class="text-center"><a
                        href="/user/edit/${k.id}" class="btn btn-sm btn-info">
                    <span class="glyphicon glyphicon-edit"></span>
                </a> <a href="/user/delete/${k.id}"
                        class="btn btn-sm btn-danger"> <span
                        class="glyphicon glyphicon-trash"></span>
                </a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>