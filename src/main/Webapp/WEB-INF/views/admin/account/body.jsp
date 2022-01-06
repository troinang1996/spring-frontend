<%@ page pageEncoding="UTF-8" %>
<h3>QUẢN LÝ THÀNH VIÊN</h3>
<ul class="nav nav-tabs">
    <li ><a data-toggle="tab" href="#list">DANH SÁCH</a></li>
</ul>
<div class="tab-content">
    <div id="edit" class="tab-pane fade in active">
        <jsp:include page="_form.jsp" />
    </div>
    <div id="list" class="tab-pane fade">
        <jsp:include page="_table.jsp"></jsp:include>
    </div>
</div>