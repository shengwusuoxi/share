define(function (require, exports, module) {
    //var wz = require("jquery");
    //var aa = require('{sliderx}');
    /**
    * @method sliderPlayV1 幻灯片播放方法
    * @sliderNavi {string},
    * @sliderMain {string},
    * @playClassNavi {string},
    * @playTime {int} 播放时间
    */
    exports.sliderPlayV1 = function (sliderNavi, sliderMain, playClassNavi, playTime) {
        sliderNavi = $("#" + sliderNavi);
        sliderMain = $("#" + sliderMain);
        var sort = 0;
        var len = sliderMain.find("li").length;
        var timer;

        function sliderPlay() {
            timer = setInterval(function () {
                sliderMain.find("li").eq(sort).animate({ 'opacity': 'hide' }, 1000);
                sliderNavi.find("li").eq(sort).removeClass(playClassNavi);

                //算出执行的下一屏
                sort = (sort == len - 1) ? 0 : sort + 1;

                $(sliderMain).find("li").eq(sort).animate({ 'opacity': 'show' }, 1000);
                sliderNavi.find("li").eq(sort).addClass(playClassNavi);

            }, playTime);
        }

        sliderNavi.find("li").hover(
                function () {
                    clearInterval(timer);
                    if (sort == sliderNavi.find("li").index(this))
                        return false;

                    sliderMain.find("li").eq(sort).stop(true, true).animate({ 'opacity': 'hide' }, 1000);
                    sliderNavi.find("li").eq(sort).removeClass(playClassNavi);

                    sort = sliderNavi.find("li").index(this);
                    sliderMain.find("li").eq(sort).stop(true, true).animate({ 'opacity': 'show' }, 1000);
                    sliderNavi.find("li").eq(sort).addClass(playClassNavi);
                },
                function () {
                    sliderPlay();
                }
             ).eq(0).trigger('mouseleave');
        //.eq(0).trigger('mouseleave')
    },
    exports.slidesForMobile = function (objSlidesBox, objSpeed, objAutoTime) {
    //手机图片幻灯片
        require("swipe-full");
        new Swipe(document.getElementById(objSlidesBox), {
            speed: objSpeed,
            auto: objAutoTime,
            disableScroll: true,
            callback: function () {
                var lis = $(this.element).next("ol").children();
                lis.removeClass("on").eq(this.index).addClass("on");
            }
        });
    },
     exports.slidesNavMenu = function (objNavMenuBox) {
     //菜单幻灯片
         require("swipe-full");
         window.navList_box = new Swipe(document.getElementById(objNavMenuBox), { auto: 0 });
     }
});