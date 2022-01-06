<%@ page pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<div class="panel panel-default">
    <div class="panel-heading">
        <h4 class="panel-title"> DANH SÁCH SẢN PHẨM ${msg}</h4>

    </div>
    <table class="table table-hover">
        <thead>
        <tr>
            <%-- < SỬA LẠI THEO THUỘC TÍNH CỦA PRODUCY LẠI>--%>
            <th>Id</th>
            <th>Name</th>
            <th>Name (VN)</th>
            <th>Image</th>
            <th>UnitPrice</th>
            <th>Discount</th>
            <th>Quantity</th>
            <th>ProductDate</th>
            <th>Available</th>
            <th>Category</th>
            <th>Description</th>
            <th>ViewCount</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="k" items="${producs}">
             <tr>
                 <td>${k.id}</td>
                 <td>${k.name}</td>
                 <td>${k.image}</td>
                 <td>${k.unitPrice}</td>
                 <td>${k.discount}</td>
                 <td>${k.quantity}</td>
                 <td>${k.productDate}</td>
                 <td>${k.available}</td>
                 <td>${k.category}</td>
                 <td>${k.description}</td>
                 <td>${k.viewCount}</td>
                 <td class="text-center"><a
                         href="/product/edit/${k.id}" class="btn btn-sm btn-info">
                     <span class="glyphicon glyphicon-edit"></span>
                 </a> <a href="/product/delete/${k.id}"
                         class="btn btn-sm btn-danger"> <span
                         class="glyphicon glyphicon-trash"></span>
                 </a></td>
             </tr>
         </c:forEach>
        </tbody>
    </table>
</div>