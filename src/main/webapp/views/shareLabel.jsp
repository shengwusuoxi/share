<!DOCTYPE html>
<html>
<head>
    <title>${dto.labelName}-藏趣</title>
    <%@include file="base/meta-include.jsp" %>
    <link href="<%=path%>/resources/css/share_label.css?v=1" rel="stylesheet" type="text/css" />
    <script>
        //
    </script>
</head>
<body>
    <jsp:include page="base/header.jsp"/>
    <div class="group_box bottom_blank">
        <div class="inner_box">
            <span class="label_title">${dto.labelName}</span> <span
                class="clearfix label_desc">&#12288;&#12288;${dto.labelDesc}</span>
            <p class="author_info" align="center">
                <strong class="logo"><img src="${dto.creatorPortraitUrl}" /></strong>
                <b class="author"><i class="active">${dto.creatorName}</i><em>创建者</em></b>
            </p>
        </div>
        <ul class="share_list">
            <c:forEach items="${dto.simplePublishList}" var="p" varStatus="loop">
                <li>
                    <div class="li_inner">
                        <img src="${p.publishImageUrl}" /> <b> <img
                            src="${p.publishUserPortraitUrl}" /> <span>${p.publishUserName}</span>
                        <em>${p.publishDate}</em>
                    </b>
                    </div>
                </li>
            </c:forEach>
        </ul>
    </div>

    <div style="visibility: visible;" class="intro">
        <span><img src="<%=path%>/resources/images/icon_logo_big.png" /></span>
        <em>藏趣</em> <a href="javascript:;">立即下载</a>
    </div>

</body>
</html>
