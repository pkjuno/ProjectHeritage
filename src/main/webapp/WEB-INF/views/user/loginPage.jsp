<%--
  Created by IntelliJ IDEA.
  User: pkjun
  Date: 2024-08-23
  Time: 오후 1:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%-- 공통 스타일 --%>
    <%@ include file="/WEB-INF/views/comm/styles.jsp" %>
    <%-- 공통 스크립트 --%>
    <%@ include file="/WEB-INF/views/comm/scripts.jsp" %>
    <title>Title</title>
</head>
<body>
  <h1> 로그인 페이지 </h1>
    <buttn id="kakaoBtn" class="btn btn-dark"> 카카오 로그인 </buttn>
</body>
<script>
    $(function(){
        $("#kakaoBtn").click(function(){
           alert("1");
        });
    });
</script>
</html>
