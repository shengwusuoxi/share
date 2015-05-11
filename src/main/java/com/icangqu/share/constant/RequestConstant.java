package com.icangqu.share.constant;

/**
 * Created by wuqiang on 14-12-23. <p/> 与请求相关的常量
 *
 * @author wuqiang
 */
public class RequestConstant {

    /**
     * 编码方式，全局UTF-8
     */
    public static final String CHARSET = "utf-8";
    /**
     * Controller方法的@RequestMapping{produces = RequestConstant.CONTROLLER_PRODUCES}
     */
    public static final String CONTROLLER_PRODUCES = "text/html;charset=" + CHARSET;

    /**
     * 请求头中填"deviceId"
     */
    public static final String HEADER_DEVICE_ID = "deviceid";
    /**
     * 请求头中填"hardware"
     */
    public static final String HEADER_HARDWARE = "hardware";
    /**
     * 请求头中填"platform";平台（0：IOS;1：安卓;2：PC;3：other）
     */
    public static final String HEADER_PLATFORM = "platform";
    /**
     * 请求头中填"osversion";
     */
    public static final String HEADER_OS_VERSION = "osversion";
    /**
     * 请求头中填"appverion";
     */
    public static final String HEADER_APP_VERSION = "appverion";
    /**
     * 请求头中填"nettype"；0：wifi网络；1:2G 2:edge 3:3G  4:4G 5:5G 6:unknown
     */
    public static final String HEADER_NET_TYPE = "nettype";

    /**
     * 请求头中填"painterId"；
     */
    public static final String HEADER_PAINTER_ID = "painterId";

    /**
     * 请求头中"packageName"的名称；
     */
    public static final String HEADER_PACKAGE_NAME = "pn";

    /**
     * 请求头中"client-width"的名称；
     */
    public static final String HEADER_CLIENT_WIDTH = "client-width";
    /**
     * 请求头中"client-height"的名称；
     */
    public static final String HEADER_CLIENT_HEIGHT = "client-height";
    /**
     * QueryString中"时间戳"参数名称
     */
    public static final String QUERY_PARAM_TIMESTAMP = "t";
    /**
     * QueryString中"设备ID"参数名称
     */
    public static final String QUERY_PARAM_DEVICE_ID = "d";
    /**
     * QueryString中"k"参数名称；AES秘钥（由客户端产生，只用于本次请求的响应加密）
     */
    public static final String QUERY_PARAM_AES_KEY = "k";

    /**
     * Session属性范围中"userInfo"的名称
     */
    public static final String SESSION_USER_INFO = "userInfo";

    /**
     * 请求头中"hardware"的名称
     */
    public static final String ATTR_HARDWARE = "hardware";
    /**
     * Request属性范围中"userKey"的名称
     */
    public static final String ATTR_USER_KEY = "USER_KEY";
    /**
     * Request属性范围中"PLATFORM"的名称，意义：手机平台，（0：IOS;1：安卓）
     */
    public static final String ATTR_PLATFORM = "platform";
    /**
     * Request属性范围中"PLATFORM"的名称，意义：手机平台，（0：IOS;1：安卓）
     */
    public static final String ATTR_OS_VERSION = "osVersion";
    /**
     * Request属性范围中"VERSION"的名称，意义：对应的版本号
     */
    public static final String ATTR_VERSION = "app_version";
    /**
     * Request属性范围中"netType"的名称，客户端网络类型
     */
    public static final String ATTR_NET_TYPE = "net_type";
    /**
     * Request属性范围中"设备ID"的名称
     */
    public static final String ATTR_DEVICE_ID = "deviceId";
    /**
     * 画家ID
     */
    public static final String ATTR_PAINTER_ID = "painterId";
    /**
     * Request属性范围中"token"的名称
     */
    public static final String ATTR_TOKEN = "token";
    /**
     * Request属性范围中"设备屏幕宽度"的名称
     */
    public static final String ATTR_CLIENT_WIDTH = "CLIENT_WIDTH";
    /**
     * Request属性范围中"设备屏幕高度"的名称
     */
    public static final String ATTR_CLIENT_HEIGHT = "CLIENT_HEIGHT";
    /**
     * Request属性范围中"CLIENT_TEMP_KEY"的名称，客户端产生的用于本次请求响应内容的加密的秘钥
     */
    public static final String ATTR_CLIENT_TEMP_KEY = "CLIENT_TEMP_KEY";
    /**
     * Request属性范围中"ENCRYPT_TYPE"的名称，意义：整个请求是否采用加密；1：AES加密；2：RSA加密
     */
    public static final String ATTR_ENCRYPT_TYPE = "ENCRYPT_TYPE";
    /**
     * 响应头中"etype"的名称：响应头中如果没有此属性表明是原文响应；1：AES加密；2：RSA加密
     */
    public static final String RESPONSE_HEADER_ETYPE = "etype";
    /**
     * 响应头中"etype"和request属性"ENCRYPT_TYPE"的对应的值：定义响应为AES加密
     */
    public static final String VALUE_ETYPE_AES = "1";
    /**
     * 响应头中"etype"和request属性"ENCRYPT_TYPE"的对应的值：定义响应为RSA加密
     */
//    public static final String VALUE_ETYPE_RSA = "2";
    /**
     * 请求头中"platform/平台";0表示 IOS
     */
    public static final int VALUE_PLATFORM_IOS = 0;
    /**
     * 请求头中"platform/平台";1表示 安卓
     */
    public static final int VALUE_PLATFORM_ANDROID = 1;
    /**
     * 请求头中"platform/平台";2表示 浏览器
     */
    public static final int VALUE_PLATFORM_BROWSER = 2;
    /**
     * 请求头中"packageName";com.imhuayou
     */
    public static final String VALUE_PACKAGE_NAME = "com.imhuayou";
    /**
     * IOS兼容，IOS POST过来的AES密文数据不在是RequestBody/FormData本身，而是使用参数名<br> 如：POST的密文数据是：/3nqNFTa94rPkUVOXB5fEd3tJDkAbOZQlE7c7yG/jYg=
     * 但在IOS中POST过来的数据是aed=%2F3nqNFTa94rPkUVOXB5fEd3tJDkAbOZQlE7c7yG%2FjYg%3D <p/>
     * 同时直接向IOS客户端返回密文数据字符串，目前也不支持，需要做成一个JSON对象:{aed:"密文数据"}
     */
    public static final String GLOBAL_AES_ENCRYPT_DATA_KEY = "aed";
}
