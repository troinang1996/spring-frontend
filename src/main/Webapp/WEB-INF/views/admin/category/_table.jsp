<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title"> DANH SÁCH LOẠI SẢN PHẨM  ${msg}</h4>

    </div>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Name (VN)</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="k" items="${cates}">
            <tr>
                <td>${k.id}</td>
                <td>${k.name}</td>
                <td>${k.nameVN}</td>
                <td class="text-center"><a
                        href="/category/edit/${k.id}" class="btn btn-sm btn-info">
                    <span class="glyphicon glyphicon-edit"></span>
                </a> <a href="/category/delete/${k.id}"
                        class="btn btn-sm btn-danger"> <span
                        class="glyphicon glyphicon-trash"></span>
                </a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>