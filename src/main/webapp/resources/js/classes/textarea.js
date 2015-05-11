define(function (require, exports, module) {
    var wz = require("jquery");

    exports.setTextareaHeight = function (rowSize, rowHeight, textObj) {
        var obj = wz("#" + textObj);
        //var len = exports.
        var len = exports.getLen(obj.val());
        //$("#txtNum").val(len);
        var rows = Math.ceil(len / rowSize);
        if (rows > 4)
            rows = 4;
        var h = rows * rowHeight;
        obj.height(h);
    },
    exports.getLen = function (s) {
        var l = 0;
        var a = s.split("");
        for (var i = 0; i < a.length; i++) {
            if (a[i].charCodeAt(0) < 299) {
                l++;
            }
            else {
                l += 2;
            }
        }
        return l;
    },
    //格式化内容
     exports.formatText = function (contentX) {
         contentX = contentX.replace(/ title=\"/g, ">[").replace(/\" src=/g, "]<");
         contentX = contentX.replace(/<[^>]*>/g, "");
         return contentX;
     },
    exports.init = function (rowSize, rowHeight, textObj) {
        var obj = wz("#" + textObj);
        obj.keyup(function () {
            exports.setTextareaHeight(rowSize, rowHeight, textObj);
        });

        //表情选择区域展开或关闭
        $(".expreSelect").click(function () {
            if ($(".tipLayer").css("display") == "none") {
                $(".tipLayer").show();
                $(this).addClass("expreSelect_ext");
                //add slider dong hua
                seajs.use("classes/slider", function (slider) {
                    slider.slidesForMobile("expreBox", 500, 0, "p", "pNumOn");
                });
            } else {
                $(".tipLayer").hide();
                $(this).removeClass("expreSelect_ext");
                var a = document.getElementById(textObj);
                a.selectionStart = obj.val().length;
                a.focus();
            }
        });

        //表情选择
        $("#expreBox li a").click(function () {
            var oldContent = obj.val();
            var nowContent = "[" + $(this).attr("title") + "]";
            if (nowContent != "[backspace]") {
                var con = oldContent + nowContent;
                //$("#txt").html(emotion.getPic(con));
                obj.val(con);
                exports.setTextareaHeight(rowSize, rowHeight, textObj);
            } else if (nowContent == "[backspace]") {
                var v = obj.val();
                var len = v.length;
                if (len > 1)
                    obj.val(v.substring(0, len - 1));
            }
        });

//                   new Swipe(document.getElementById('expreBox'), {
//                       speed: 500,
//                       auto: 0,
//                       callback: function () {
//                           var lis = $(this.element).next("p").children();
//                           lis.removeClass("pNumOn").eq(this.index).addClass("pNumOn");
//                       }
//                   })
    }
});