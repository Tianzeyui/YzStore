<%--
  Created by IntelliJ IDEA.
  User: tzy
  Date: 2018/10/27
  Time: 8:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<button id="usernum">点击获取用户数</button>
</body>
<script>
    var json = {"uage": 21, "uid": 1, "uname": "admin", "uphone": "17335844312", "usex": 0};
    $(function () {
        $('#usernum').click(function () {
            $.ajax({
                url: "/sendUserJSON",
                data: JSON.stringify(json),
                contentType: "application/json",
                type: "post",
                success : function(res){
                    alert(res);
                }
            });
        });
    });
</script>
</html>
