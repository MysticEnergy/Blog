<!DOCTYPE HTML>
<html>
<head>
	<title>Home</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- Bootstrap Core CSS -->
	<link href="../../../resources/css/common/bootstrap.min.css" rel='stylesheet' type='text/css' />
	<!-- Custom CSS -->
	<link href="../../../resources/css/end/style.css" rel='stylesheet' type='text/css' />
	<!-- Graph CSS -->
	<link href="../../../resources/css/end/lines.css" rel='stylesheet' type='text/css' />
	<link href="../../../resources/css/end/font-awesome.css" rel="stylesheet">
	<!-- jQuery -->
	<script src="../../../resources/js/common/jquery-3.0.0.min.js"></script>
	<!----webfonts--->
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
	<!---//webfonts--->
	<!-- Nav CSS -->
	<link href="../../../resources/css/end/custom.css" rel="stylesheet">
	<!-- Metis Menu Plugin JavaScript -->
	<script src="../../../resources/js/end/metisMenu.min.js"></script>
	<script src="../../../resources/js/end/custom.js"></script>
	<!-- Graph JavaScript -->
	<script src="../../../resources/js/end/d3.v3.js"></script>
	<script src="../../../resources/js/end/rickshaw.js"></script>
    <script>
        function deleteBlog(id) {
            $.ajax({
                url:'/admmmmin/list/'+id,
                type:'delete',
                async:true,
                success:window.location.reload()
            })
        }
        function updateBlog(id) {
            window.location.href = '/admmmmin/list/'+id;
        }
    </script>
</head>
<body>
<div id="wrapper">
    <!-- Navigation -->
    <nav class="top1 navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.ftl">MysticEnergy</a>
        </div>
        <!-- /.navbar-header -->

        <form class="navbar-form navbar-right">
            <input type="text" class="form-control" value="Search..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search...';}">
        </form>
        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
                    <li>
                        <a href="index.ftl"><i class="fa fa-dashboard fa-fw nav_icon"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-table nav_icon"></i>Tables<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="list.ftl">Basic Tables</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>
                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
        <!-- /.navbar-static-side -->
    </nav>
    <div id="page-wrapper">
        <div class="bs-example4" data-example-id="contextual-table">
            <table class="table">
                <thead>
                <tr>
                    <th>id</th>
                    <th>title</th>
                    <th>create time</th>
                    <th>update time</th>
                    <th>operation</th>
                </tr>
                </thead>
                <tbody>
                <#list blogs as item>
                    <tr class = "active">
                        <td scope="row">${item.id}</td>
                        <td>${item.title}</td>
                        <td>${item.createTime}</td>
                        <td>
                            <#if item.updateTime??>
                                ${item.updateTime}
                            <#else>
                            NEVER
                            </#if>
                        </td>
                        <td>
                            <button type="button" class="btn btn-default" onclick="updateBlog(${item.id})">修改</button>
                            <button type="button" class="btn btn-danger" onclick="deleteBlog(${item.id})">删除</button>
                        </td>
                    </tr>
                </#list>
                </tbody>
            </table>
        </div>
        <div class="clearfix"> </div>
        <div class="clearfix"> </div>
    </div>
    <div class="copy">
        <p>Copyright &copy; 2017.Company name All rights reserved.</p>
    </div>
</div>
<!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->
<!-- Bootstrap Core JavaScript -->
<script src="../../../resources/js/common/bootstrap.min.js"></script>

</body>
</html>
