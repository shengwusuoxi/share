package com.icangqu.share.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

/**
 * @author doer
 */

public class ConfigUtil {

//    private static Logger log = LoggerFactory.getLogger(ConfigUtil.class);
    private static Properties properties;
    /*对应配置文件-start*/
    // 是否是本地开发模式
    private static boolean debug = true;
//    // 是否在TaskInterceptor输出info级别的信息（就算为true，也还要取决于对应task的info级别的消息是否输出）
//    private static boolean showTaskLogInInterceptor = false;
//    // 请求中的时间戳与服务器时间允许的最大误差（单位毫秒），小于等于0：表示不验证时间戳
//    private static long timeDeviation = 600000;
//    // 是否启用加密通信
//    private static boolean encryptionEnabled = true;
//    // AES加密后的queryString的最大长度，原则上320个字符已经够了，除非queryString中还要再添加参数，小于等于0：表示不验证encryptionQueryString的长度
//    // TODO 待进一步验证设置多大才合适
//    private static int maxAesEncryptionQueryStringLength = 1024;
//    // RSA加密后的queryString的最大长度，原则上1024个字符已经够了，除非queryString中还要再添加参数，小于等于0：表示不验证encryptionQueryString的长度
//    // TODO 待进一步验证设置多大才合适
//    private static int maxRsaEncryptionQueryStringLength = 1024;
    // 是否真实发送短信（发送验证码时，方便本地测试无需发送验证码）
    private static boolean sendSms = false;


//
//    /*环信配置-start*/
//    private static String hxOrgName;
//    private static String hxAppName;
//    private static String hxClientId;
//    private static String hxClientSecret;
//    /*环信配置-end*/
//
//    /*七牛配置-start*/
//    private static String qiniuAccessKey;
//    private static String qiniuSecretKey;
//    private static String qiniuBucketname;
//    private static String qiniuBaseUrl;
//    /**
//     * uploadToken的有效时长（单位秒）
//     */
//    private static long qiniuUploadTokenExpireTime;
//    /*七牛配置-end*/
        /*百度推送-start*/
        private static String baiduPushApiKey_android;
        private static String baiduPushSecretKey_android;

        private static String baiduPushApiKey_ios;
        private static String baiduPushSecretKey_ios;
//    /*百度推送-end*/
//    /*IOS推送必要参数*/
//    private static String iosp12Location;
//
//    /*在HyUser表中，的超级管理员用户*/
//    private static Integer superUserId;
//    /*htmlMobileServer BaseUrl*/
//    private static String htmlPageServerHost;
//    /*对应配置文件-end*/
//    // final，无法通过配置文件修改
//    // 短信验证码的有效时长的毫秒数，默认1小时
//    private static final long smsVerifyCodeExpiredTime = 1 * 60 * 60 * 1000L;
    // 短信验证码的Token有效时长的毫秒数，默认24小时
    private static final long smsVerifyTokenExpiredTime = 24 * 60 * 60 * 1000L;

    /**
     * initialization
     */
    static {
        try {
            Properties profileProperties = PropertiesLoader.init("application-profile.properties");
            String profileName = profileProperties.getProperty("profile_name");
            String profileNameProperties = profileName + ".properties";
            properties = PropertiesLoader.init(profileNameProperties);
            Field[] fields = ConfigUtil.class.getDeclaredFields();
            if (fields != null) {
                for (Field fd : fields) {
                    String fieldName = fd.getName();
                    if (Modifier.isFinal(fd.getModifiers()) || "log".equals(fieldName)
                        || "properties".equals(fieldName)
                        || "isInit".equals(fieldName)) {
                        continue;
                    }
                    Class<?> fieldType = fd.getType();
                    String value = null;
                    try {
                        value = properties.getProperty(fieldName);
                    } catch (Exception e) {
                    }
                    if (value != null) {
                        Object realValue = null;
                        try {
                            if (String.class.equals(fieldType)) {
                                realValue = value;
                            } else if (Boolean.class.equals(fieldType)
                                       || boolean.class.equals(fieldType)) {
                                realValue = Boolean.parseBoolean(value);
                            } else if (Integer.class.equals(fieldType)
                                       || int.class.equals(fieldType)) {
                                realValue = Integer.parseInt(value);
                            } else if (Long.class.equals(fieldType)
                                       || long.class.equals(fieldType)) {
                                realValue = Long.parseLong(value);
                            } else if (Float.class.equals(fieldType)
                                       || float.class.equals(fieldType)) {
                                realValue = Float.parseFloat(value);
                            } else if (Double.class.equals(fieldType)
                                       || double.class.equals(fieldType)) {
                                realValue = Double.parseDouble(value);
                            }
                        } catch (Exception e) {
                            throw new RuntimeException(
                                "failed to parse " + fieldName + " for " + ConfigUtil.class
                                    .getName() + " from " + profileNameProperties, e);
                        }
                        if (realValue != null) {
                            fd.setAccessible(true);
                            try {
                                fd.set(ConfigUtil.class, realValue);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
        } catch (Exception mre) {
            throw new RuntimeException(mre);
        }
    }

    public static String getConfigValue(String key) {
        try {
            return properties.getProperty(key);
        } catch (Exception e) {
            //log.error("getConfigValue method Exception ---->" + e);
            return null;
        }
    }

//    public static final int getConfigIntValue(String key) {
//        return NumberUtils.toInt(getConfigValue(key));
//    }
//
//    public static final int getConfigIntValue(String key, int defaultInt) {
//        return NumberUtils.toInt(getConfigValue(key), defaultInt);
//    }
//
//    /**
//     * 是否启用加密通信
//     */
//    public static boolean isEncryptionEnabled() {
//        return encryptionEnabled;
//    }
//
        /**
         * 是否是本地开发模式
         */
        public static boolean isDebug() {
            return debug;
        }
//
//    /**
//     * 请求中的时间戳与服务器时间允许的最大误差（单位毫秒），小于等于0：表示不验证时间戳
//     */
//    public static long getTimeDeviation() {
//        return timeDeviation;
//    }
//
//    /**
//     * AES加密后的queryString的最大长度，原则上320个字符已经够了，除非queryString中还要再添加参数，小于等于0：表示不验证encryptionQueryString的长度
//     */
//    public static int getMaxAesEncryptionQueryStringLength() {
//        return maxAesEncryptionQueryStringLength;
//    }
//
//    /**
//     * RSA加密后的queryString的最大长度，除非queryString中还要再添加参数，小于等于0：
//     */
//    public static int getMaxRsaEncryptionQueryStringLength() {
//        return maxRsaEncryptionQueryStringLength;
//    }
//
    public static boolean isSendSms() {
        return sendSms;
    }


//
//    /**
//     * @return 短信验证码的有效时长的毫秒数
//     */
//    public static long getSmsVerifyCodeExpiredTime() {
//        return smsVerifyCodeExpiredTime;
//    }
//
    /**
     * @return 短信验证码的Token有效时长的毫秒数
     */
    public static long getSmsVerifyTokenExpiredTime() {
        return smsVerifyTokenExpiredTime;
    }
//
//    public static String getHxClientSecret() {
//        return hxClientSecret;
//    }
//
//    public static String getHxOrgName() {
//        return hxOrgName;
//    }
//
//    public static String getHxAppName() {
//        return hxAppName;
//    }
//
//    public static String getHxClientId() {
//        return hxClientId;
//    }
//
//    public static String getQiniuAccessKey() {
//        return qiniuAccessKey;
//    }
//
//    public static String getQiniuSecretKey() {
//        return qiniuSecretKey;
//    }
//
//    public static String getQiniuBucketname() {
//        return qiniuBucketname;
//    }
//
//    public static String getQiniuBaseUrl() {
//        return qiniuBaseUrl;
//    }
//
//    /**
//     * uploadToken的有效时长（单位秒）
//     */
//    public static long getQiniuUploadTokenExpireTime() {
//        return qiniuUploadTokenExpireTime;
//    }
//
        public static String getBaiduPushApiKeyAndroid() {
            return baiduPushApiKey_android;
        }

        public static String getBaiduPushSecretKeyAndroid() {
            return baiduPushSecretKey_android;
        }

        public static String getBaiduPushApiKeyIOS() {
            return baiduPushApiKey_ios;
        }

        public static String getBaiduPushSecretKeyIOS() {
            return baiduPushSecretKey_ios;
        }
//
//    public static String getIosp12Location() {
//        return iosp12Location;
//    }
//
//    public static Integer getSuperUserId() {
//        return superUserId;
//    }
//
//    public static boolean isShowTaskLogInInterceptor() {
//        return showTaskLogInInterceptor;
//    }
//
//    public static String getHtmlPageServerHost() {
//        return htmlPageServerHost;
//    }
}
