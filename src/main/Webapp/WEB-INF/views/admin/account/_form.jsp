<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form modelAttribute="user" >
    <div class="panel panel-default">
        <div class="panel-heading">
            <h4 class="panel-title"> THAO TÁC </h4>
        </div>

        <div class="panel-body">
            <div class="form-group">
                <label>Id</label>
                <form:input path="id" class="form-control" readonly="true"
                            placeholder="rAuto Numbe" />
            </div>
            <div class="form-group">
                <label>Name</label>
                <form:input path="name" class="form-control" required="true"/>
            </div>
            <div class="form-group">
                <label>Name (VN)</label>
                <form:input path="nameVN" class="form-control" required="true" />
            </div>
        </div>
        <div class="panel-footer text-right">
            <div class="pull-left text-danger">${msg}</div>
           <jsp:include page="_btn-crud.jsp" />
        </div>
    </div>
</form:form>