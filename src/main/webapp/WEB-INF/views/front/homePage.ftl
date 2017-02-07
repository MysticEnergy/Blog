<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet"
          href="/resources/css/common/bootstrap.min.css"/>
    <link rel="stylesheet" href="/resources/css/common/mainPage-font.css"/>
</head>
<body>
<div class="container">
    <div class="row clearfix" style="padding-left: 100px;padding-right: 100px">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1 style="display: inline">
                    Mystic Energy
                    <small> nothing</small>
                </h1>
                <form class="navbar-form navbar-right">
                    <input type="text" class="form-control" value="Search..." onfocus="this.value = '';"
                           onblur="if (this.value == '') {this.value = 'Search...';}">
                </form>
            </div>
        <#list blogs as item>
            <a href="/blog/${item.id}" style="text-decoration: none">
                <h2 style="padding-top: 30px">
                ${item.title}
                </h2>
            </a>
            <h4>
                <small> ${item.createTime} / ${item.hits}点击</small>
            </h4>
            <p>
            ${item.abstractContent}
            </p>
            <#list item.tag as tag>
                <#switch tag_index%6>
                    <#case 0>
                        <span class="label label-warning">${tag}</span>
                        <#break>
                    <#case 1>
                        <span class="label label-info">${tag}</span>
                        <#break>
                    <#case 2>
                        <span class="label label-default">${tag}</span>
                        <#break>
                    <#case 3>
                        <span class="label label-danger">${tag}</span>
                        <#break>
                    <#case 4>
                        <span class="label label-primary">${tag}</span>
                        <#break>
                    <#case 5>
                        <span class="label label-success">${tag}</span>
                        <#break>
                </#switch>
            </#list>
        </#list>
        </div>
    </div>
</div>
<script type="text/javascript"
        src="/resources/js/common/jquery-3.0.0.min.js"></script>
<script type="text/javascript"
        src="/resources/js/common/bootstrap.min.js"></script>


</body>
</html>