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
	<link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
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
        function postBlog() {
            $.ajax({
                url:'/admmmmin/post',
                type:'post',
                data:$('#postForm').serialize(),
                async:false,
               success:window.location.href='/admmmmin/index'
            })
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
        <div>
            <form id="postForm" class="form-horizontal" style="margin-left: 100px">
                <fieldset>
                    <div id="legend" class="">
                        <legend class="row_3">发布/修改文章</legend>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <input name="title" type="text" style="width:60%;overflow-x:visible;overflow-y:visible;" placeholder="请输入标题" class="input-xlarge">
                        </div>
                    </div>
                    <div class="control-group">

                        <!-- Textarea -->
                        <label class="control-label">正文：</label>
                        <div class="controls">
                            <div class="textarea">
                                <textarea name="content" type="text" style="width:60%;height:300px;"> </textarea>
                            </div>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <input name="tag" type="text" style="width:60%;overflow-x:visible;overflow-y:visible;" placeholder="请输入标签" class="input-xlarge">
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                            <button type="button" class="btn btn-success" onclick="postBlog()" onsubmit="false">发布</button>
                        </div>
                    </div>

                </fieldset>
            </form>
        </div>
                <div class="clearfix"> </div>
                <div class="clearfix"> </div>
            </div>
            <div class="copy">
                <p>Copyright &copy; 2017.Company name All rights reserved.</p>
            </div>
        </div>
    <!-- /#page-wrapper -->
<!-- /#wrapper -->
<!-- Bootstrap Core JavaScript -->
<script src="../../../resources/js/common/bootstrap.min.js"></script>
</body>
</html>
