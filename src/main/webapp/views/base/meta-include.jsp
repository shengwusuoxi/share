<%@ page language="java" pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- 导入java库 --%>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<meta content="text/html; charset=UTF-8" http-equiv="Content-Type" />
<meta content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
<meta content="yes" name="apple-mobile-web-app-capable" />
<!-- apple devices fullscreen -->
<meta name="apple-mobile-web-app-status-bar-style" content="black" />
<meta name="format-detection" content="telephone=no, address=no" />
<!-- Mobile Devices Support @begin -->
<meta content="no-cache,must-revalidate" http-equiv="Cache-Control" />

<%
    //项目基础路径
    String path = request.getContextPath();
%>

<%-- css库 --%>

<%-- js库 --%>
<script src="<%=path%>/resources/js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="<%=path%>/resources/js/sea.js" type="text/javascript"></script>