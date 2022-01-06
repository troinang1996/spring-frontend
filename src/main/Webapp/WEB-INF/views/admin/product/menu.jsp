<%@ page pageEncoding="UTF-8" %>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse"
                    data-target="#menu">
                <span class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><span
                    class="glyphicon glyphicon-home"></span> Trang chủ</a>
        </div>
        <div class="collapse navbar-collapse" id="menu">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown"><a class="dropdown-toggle"
                                        data-toggle="dropdown" href="#"> <span
                        class="glyphicon glyphicon-briefcase"></span> Quản lý <span
                        class="caret"></span>
                </a>
                    <ul class="dropdown-menu">
                        <li><a href="/product/index">Sản phẩm</a></li>
                        <li><a href="/category/index">Loại sản phẩm</a></li>
                        <li><a href="/user/index">User</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle"
                       data-toggle="dropdown" href="#"> <span
                            class="glyphicon glyphicon-lock"></span>Security<span
                            class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Create Document</a></li>
                        <li><a href="#">Sign Out</a></li>
                        <li><a href="#">Change Password</a></li>
                        <li class="divider"></li>
                        <li><a href="#">User
                            Permissions</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>