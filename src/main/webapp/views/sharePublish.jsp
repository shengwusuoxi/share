<!DOCTYPE html>
<html>
<head>
    <title>${d.labelName}-藏趣</title>
    <%@include file="base/meta-include.jsp" %>
    <link href="<%=path%>/resources/css/share_label.css?v=1" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="<%=path%>/resources/css/share_muti.css" type="text/css" />
    <script>
        $(function() {
            seajs.config({
                charset : "utf-8",
                alias : {
                    "jquery" : "jquery-sea.min.js"
                }
            });
            seajs.use("classes/slides", function(slides) {
                slides.slidesForMobile("banner-box", 500, 6000);
            });
        });
    </script>
</head>
<body>

    <jsp:include page="base/header.jsp"/>

    <div class="header" style="display:none;">${d.creatorName}的宝贝-藏趣</div>
    <div class="group_box bottom_blank">
        <div class="inner_box">
            <p class="author_info" align="center">
                <strong class="logo"><img src="${d.creatorPortraitUrl}" /></strong>
                <span>${d.creatorName}</span> <em>${d.createDate}</em>
                <a href="https://itunes.apple.com/cn/app/id477927812" id="openApp">下载藏趣客户端</a>
            </p>
            <div class="image_box">
                <img src="<%=path%>/resources/images/icon_muti_picture_bg.png" />
            </div>
            <div class="image_box muti">
                <div style="visibility: visible;" id="banner-box" class="box_swipe">
                    <ul class="pul">
                        <c:forEach items="${d.publishIncludeImageUrlList}" var="imgUrl"
                                   varStatus="loop">
                            <li><img src="${imgUrl}" /></li>
                        </c:forEach>
                    </ul>
                    <ol>
                        <li class="on"></li>
                        <li class=""></li>
                        <li class=""></li>
                    </ol>
                </div>
            </div>

            <div class="clear"></div>
            <div class="message_box">
                <i class="fa fa-file-text-o"></i><span>${d.commentCount}人评论</span><em>${d.expertAdviceCount}条专家意见</em>
            </div>
            <div class="desc">${d.description}</div>
            <div class="comment_percent">
                <img src="<%=path%>/resources/images/icon_circle_bg.png" /> <span>${d.ratio}</span> <em>看好</em>
            </div>
        </div>
        <div class="recommand_title">推荐宝贝</div>
        <ul class="rocommand_list">
            <c:forEach items="${d.recommendPublishImageUrlList}" var="imgUrl"
                       varStatus="loop">
                <li><img src="${imgUrl}" /></li>
            </c:forEach>
        </ul>
        <div class="clear"></div>
    </div>

    <div style="visibility: visible;" class="intro">
        <span> <img src="<%=path%>/resources/images/icon_logo_big.png" /></span> <em>藏趣</em> <a
            href="javascript:;">立即下载</a>
    </div>

    <script type="text/javascript">
        document.getElementById('openApp').onclick = function(e) {
            // 通过iframe的方式试图打开APP，如果能正常打开，会直接切换到APP，并自动阻止a标签的默认行为
            // 否则打开a标签的href链接
            var ifr = document.createElement('iframe');
            ifr.src = 'com.baidu.tieba://';
            ifr.style.display = 'none';
            document.body.appendChild(ifr);
            window.setTimeout(function() {
                document.body.removeChild(ifr);
            }, 3000)
        };
    </script>

</body>
</html>
