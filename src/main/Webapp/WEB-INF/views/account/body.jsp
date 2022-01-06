<%@ page pageEncoding="UTF-8" %>
<form action="/account/login" method="post">
    <div class="panel panel-default">
        <div class="panel-heading">
            <div class="text-danger pull-right"></div>
            <h4 class="panel-title">ĐĂNG NHẬP</h4>
        </div>
        <div class="panel-body">
            <div class="form-group">
                <label>Tài khoản</label>
                <input name="username" value="" class="form-control" required="required">
            </div>
            <div class="form-group">
                <label>Mật khẩu</label>
                <input type="password" name="password"  value="" class="form-control" required="required">
            </div>
            <div class="form-group">
                <label> <input name="remember" type="checkbox" value="true"
                ${empty username ? '' : 'checked'}> Ghi nhớ tài khoản ?
                </label>
            </div>
        </div>
        <div class="panel-footer text-right">
            <div class="pull-left text-danger">${notify}</div>
            <button class="btn btn-warning">
                <span class="glyphicon glyphicon-user"></span> Đăng nhập
            </button>
        </div>

    </div>

</form>