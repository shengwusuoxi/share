define(function (require, exports, module) {
    exports.setWeixinBridge = function (imgUrl, friendLink, friendTitle, friendContent, shareLink, shareTitle, shareContent, weiboLink, weiboContent) {
        document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
            window.shareData = {
                "imgPath": imgUrl,
                "fLink": friendLink,
                "fTitle": friendTitle,
                "fContent": friendContent,
                "timeLineLink": shareLink,
                "timeLineTitle": shareTitle,
                "timeLineContent": shareContent,
                "wbLink": weiboLink,
                "wbContent": weiboContent
            };
            // 发送给好友          
            WeixinJSBridge.on('menu:share:appmessage', function (argv) {
                WeixinJSBridge.invoke('sendAppMessage', {
                    "img_url": window.shareData.imgPath,
                    // "img_width": "640",                
                    // "img_height": "640",                  
                    "link": window.shareData.fLink,
                    "desc": window.shareData.fContent,
                    "title": window.shareData.fTitle
                }, function (res) {
                    _report('send_msg', res.err_msg);
                });
            });
            // 分享到朋友圈          
            WeixinJSBridge.on('menu:share:timeline', function (argv) {
                WeixinJSBridge.invoke('shareTimeline', {
                    "img_url": window.shareData.imgPath,
                    "img_width": "120",
                    "img_height": "120",
                    "link": window.shareData.timeLineLink,
                    "desc": window.shareData.timeLineContent,
                    "title": window.shareData.timeLineTitle + "\n" + window.shareData.timeLineContent
                },
                function (res) {
                    _report('timeline', res.err_msg);
                });
            });
            // 分享到微博 
            WeixinJSBridge.on('menu:share:weibo', function (argv) {
                WeixinJSBridge.invoke('shareWeibo', {
                    "content": window.shareData.wbContent,
                    "url": window.shareData.wbLink
                },
                function (res) {
                    _report('weibo', res.err_msg);
                });
            });
            WeixinJSBridge.call('hideToolbar');
        }, false);
    }
});