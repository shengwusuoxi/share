<!DOCTYPE html>
<html>
<head>
    <title>传家宝-藏趣</title>
    <%@include file="base/meta-include.jsp" %>
    <link href="<%=path%>/resources/css/share_label.css?v=1" rel="stylesheet" type="text/css" />
    <script>
        //
    </script>
</head>
<body>
    <jsp:include page="base/header.jsp"/>
    <div class="header" style="display:none;">
        ${dto.creatorName}-藏趣
    </div>
    <div class="group_box bottom_blank">
        <div class="inner_box">
            <span class="label_title">${dto.creatorName}</span>
            <span class="clearfix label_desc">&#12288;&#12288;我有一只传宝家呀，传家宝呀传家宝，它就在这呀就在这呀就在呀。</span>
            <p class="author_info" align="center">
                <strong class="logo"><img src="<%=path%>/resources/images/icon_logo.png" /></strong>
                <b class="author"><i class="active">藏趣APP</i><em>创建者</em></b>
            </p>
        </div>
        <ul class="share_list">
            <li>
                <div class="li_inner">
                    <img src="<%=path%>/resources/images/demo_product_1.png" />
                    <b>
                        <img src="<%=path%>/resources/images/demo_header2.png" />
                        <span>Crystal</span>
                        <em>2014-04-25</em>
                    </b>

                </div>
            </li>
            <li>
                <div class="li_inner">
                    <img src="<%=path%>/resources/images/demo_product_2.png" />
                    <b>
                        <img src="<%=path%>/resources/images/demo_header2.png" />
                        <span>Crystal</span>
                        <em>2014-04-25</em>
                    </b>
                </div>
            </li>
            <li>
                <div class="li_inner">
                    <img src="<%=path%>/resources/images/demo_product_3.png" />
                    <b>
                        <img src="<%=path%>/resources/images/demo_header2.png" />
                        <span>Crystal</span>
                        <em>2014-04-25</em>
                    </b>
                </div>
            </li>
            <li>
                <div class="li_inner">
                    <img src="<%=path%>/resources/images/demo_product_1.png" />
                    <b>
                        <img src="<%=path%>/resources/images/demo_header2.png" />
                        <span>Crystal</span>
                        <em>2014-04-25</em>
                    </b>
                </div>
            </li>
        </ul>
    </div>

    <div style="visibility: visible;" class="intro">
        <span><img src="<%=path%>/resources/images/icon_logo_big.png" /></span>
        <em>藏趣</em>
        <a href="javascript:;">立即下载</a>
    </div>
</body>
</html>
