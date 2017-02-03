<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet"
          href="/resources/css/common/bootstrap.min.css"/>
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
                <form class="form-search" style="display: inline;float: right;">
                    <input class="input-medium search-query"  type="text"/>
                    <button type="submit" class="btn btn-lg">
                        <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                        查找</button>
                </form>
            </div>
            <#list blogs as item>
                <h2 style="padding-top: 30px">
                    ${item.title}
                </h2>
                <h4>
                    <small> ${item.createTime} / ${item.hits}点击</small>
                </h4>
                <p>
                     ${item.content}
                </p>
                <span class="label label-success">${item.tag}</span>
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