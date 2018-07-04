<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>战斗列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<form class="form-horizontal" role="form" action="/vote/submit">
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label">名字</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="userName"
                   placeholder="请输入名字" required>
        </div>
    </div>
    <div class="form-group">
        <label for="lastname" class="col-sm-2 control-label">战斗时间</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="fightTime"
                   placeholder="请输入战斗时间" required>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">提交</button>
        </div>
    </div>
</form>
<div class="container">
    <p>今晚战斗列表:</p>
    <table class="table table-striped table-bordered table-hover table-condensed">
        <thead>
        <tr>
            <th>名字</th>
            <th>战斗时间</th>
        </tr>
        </thead>
        <tbody>
            <#list voteList as vote>
            <tr>
                <td>${vote.userName}</td>
                <td>${vote.fightTime}</td>
            </tr>
            </#list>
        </tbody>
    </table>
</div>
</body>


<script type="text/javascript">
    function toregister() {
        $.ajax({
            url: 'http://127.0.0.1:8080/user/toregister.json',
            type: 'get',
            contentType: 'application/json; charset=utf-8',
            dataType: 'json',
        });
    }
</script>

</html>