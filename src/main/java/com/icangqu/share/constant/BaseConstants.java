package com.icangqu.share.constant;

/**
 * @Author : doer
 */
public interface BaseConstants {
    /**
     * 操作成功时，JsonObjectInfo.resultCode对应的值
     */
    public static final int SUCCESS_RESULT_CODE = 1;
    /**
     * 操作失败时，JsonObjectInfo.resultCode对应的值
     */
    public static final int ERROR_RESULT_CODE = 0;
    /**
     * 操作失败：用户秘钥不正确，无法解密数据，JsonObjectInfo.resultCode对应的值
     * 或者强制用户退出
     */
    public static final int ERROR_RESULT_CODE_USER_SECRET_NON_CORRECT = -1;
    /**
     * 服务器无法对请求进行加密，需要向客户端返回的明文错误信息
     */
    public static final String UNABLE_ENCRYPT_ERROR = "服务器加密信息";
    public static final String TIMESTAMP_ERROR = "请求无法处理，请确认你的系统时间是否正确";
    public static final String SYSTEM_ERROR_STR = "服务繁忙，请稍后重试";
    /**
     * 与ERROR_RESULT_CODE_USER_SECRET_NON_CORRECT对应
     */
    public static final String USER_SECRET_NON_CORRECT = "你的密码已改变，请重新登录";

    /**
     * 附近随身画廊模块，初始查询的距离(1000米)
     */
    public static final long NEAR_USERS_BASE_DISTANCE = 1000L;

    /**
     * 附近随身画廊模块，最大查询的距离(1000千米)
     */
    //public static final long NEAR_USERS_MAX_DISTANCE = 1000_000L;

    /**
     * 附近随身画廊模块，查询距离放大倍数
     */
    public static final int NEAR_USERS_DISTANCE_ZOOM = 5;

    /**
     * 当用户不开放地理未知信时，用于替换的信息
     */
    public static final String MSG_USER_HIDE_LOCATION = "用户未开放位置信息";




    public static final String PHONE_NUMBER_EXISTED_STR = "该手机号码已被注册";
    public static final String PHONE_NUMBER_NOT_EXISTED_STR = "该手机号码未注册";
    public static final String SEND_VERIFY_CODE_SMS_ERROR_HOUR = "获取验证码过于频繁，请稍后再试";
    public static final String SEND_VERIFY_CODE_SMS_ERROR_DAY = "获取验证码过于频繁，请稍后再试";
    public static final String REGISTER_VERIFY_SMS_MSG = "【随身画廊】你正在注册随身画廊账号，验证码：{0}，打死都不能告诉别人哦！";
    public static final String MODIFYPASSWD_VERIFY_SMS_MSG = "【随身画廊】你正在找回随身画廊账户密码，验证码：{0}，如果非本人操作，请注意账户安全！";
    public static final String VERIFY_SMS_SEND_SUCCESS = "验证码已发送，请注意查收";
    public static final String TEST_VERIFY_SMS_SEND_SUCCESS = "验证码：{0}";
    public static final String VERIFY_SMS_SEND_FAIL = "验证码发送失败，请重试";
    public static final String PASSED_PARAMETERS_ERROR_STR = "请检查信息是否填写完整";
    public static final String REGISTER_PASSWORD_LENGTH_ILLEGAL = "密码只能是{0}到{1}位";
    public static final String PHONE_NUMBER_ILLEGAL_STR = "请填写正确的手机号";
    public static final String VERIFY_CODE_EXPIRE = "验证码已过期，请重新获取";
    public static final String VERIFY_CODE_WRONG = "验证码错误，请重新获取";
    public static final String MODIFY_PASSWD_SUCCESS = "修改密码成功";
    public static final String MODIFY_PASSWD_FAIL = "修改密码失败";
    public static final String CANNOT_GET_USERID_FROM_HTTPHEADER = "无法获取请求的用户信息";
    public static final String PARAMETER_ERROR_STR = "参数值错误";
    public static final String WORKSERIES_CREATE_FAIL = "画作系列创建失败";
    public static final String WORKSERIES_CREATE_SUCCESS = "画作系列创建成功";
    public static final String WORK_CREATE_FAIL = "作品创建失败";
    public static final String WORK_CREATE_SUCCESS = "作品创建成功";
    public static final String CANNOT_FIND_WORK = "无法找到指定的作品";
    public static final String WORK_MODIFY_SUCCESS = "作品更新成功";
    public static final String WORK_MODIFY_FAIL = "作品更新失败";
    public static final String THE_USER_IS_NOT_EXISTED_STR = "该用户不存在";
    public static final String USER_MODIFY_SUCCESS = "修改用户信息成功";
    public static final String USER_MODIFY_FAIL = "修改用户信息失败";
    public static final String LOGIN_NAME_NOTEXISTED_STR = "账号不存在";
    public static final String CANNOT_COMMENT_TO_SELF = "不能给自己留言";
    public static final String COMMENT_SENDER_NOTEXIST_STR = "留言发送用户不存在";
    public static final String COMMENT_RECEIVER_NOTEXIST_STR = "留言接受用户不存在";
    public static final String COMMENT_FAILED = "留言失败";
    public static final String COMMENT_SUCCESS = "留言成功";
    public static final String REPLY_COMMENT_FAILED = "回复留言失败";
    public static final String REPLY_COMMENT_SUCCESS = "回复留言成功";
    public static final String REPLY_ROLE_ERROR_PLAIN = "普通用户之间不能回复！";
    public static final String REPLY_ROLE_ERROR_PAINTER = "画家之间不能回复！";







    public static final String INTERNAL_ERROR_STR = "服务繁忙，请稍后重试";
    public static final String SEND_MSG_ERROR_STR = "不能发送短信";
    public static final String VERIFICATION_CODE_EXPIRED_STR = "验证码过期";
    public static final String VERIFICATION_CODE_WRONG_STR = "验证码错误，请重新获取";
    public static final String CODE_ALREADY_VERIFIED_STR = "该验证码已被使用";
    public static final String SET_PASSWD_TOKEN_NOT_MATCHED_STR = "The passed in token was not matched.";
    public static final String SAME_PHONE_NUMBER_ADDED_STR = "该号码已存在";
    public static final String NO_THE_PHONE_NUM_STR = "Sorry, there is no record matched the inputed phone number.";
    public static final String HY_ID_EXISTED_STR = "随身画廊号已被抢占，请尝试其他";
    public static final String NOT_ALLOW_UPDATE_HY_ID_STR = "你已不能再修改随身画廊号了";
    public static final String HY_ID_INVALID_STR = "随身画廊号只支持字母、数字、\"_\"，5-20个字符";
    public static final String HY_ID_INVALID_STARTS_WITH_HY_STR = "随身画廊号不能以\"hy_\"开头";
    public static final String LOGIN_PASSWORD_ERROR_STR = "手机号或密码错误";
    public static final String LOGIN_NAME_EXISTED_STR = "账号不存在";
    public static final String CAN_NOT_UPDATE_LOGIN_NAME_STR = "Sorry, user can't modity his login name.";
    public static final String CAN_NOT_POST_DRAWING_WITHOUT_IMG_STR = "Sorry, user can't post drawing without image.";
    public static final String THE_INPUT_CONTENT_INVALID_STR = "你输入的内容不合理";
    public static final String CAN_NOT_DEL_DRAWING_BY_OTHER_STR = "你不可删除他人作品!";
    public static final String OLD_PASSWORD_NOT_CORRECT_STR = "旧密码错误";
    public static final String USER_IS_NOT_EXISTED_STR_OR_BLOCKED = "用户不存在或被屏蔽";
    public static final String THE_LABEL_IS_NOT_EXISTED_STR = "该标签不存在";
    public static final String LABEL_NAME_ALL = "全部";
    public static final String USER_DID_NOT_FINISH_REGISTER_STR = "The user have not finish the register flow";
    public static final String NOT_OFFICE_VERSION_ERROR_STR = "你正在使用的随身画廊手机APP为非官方发布版，请重新安装。\n1.卸载当前使用的随身画廊\n2.重新安装(请你注意官方认证标识!)";
    public static final String UPLOAD_FAILED_STR = "上传失败";
    public static final String YOU_MUST_LOGIN_STR = "用户未登录";
    public static final String CAN_NOT_BLACKLIST_YOURSELF_STR = "不能将自己加入黑名单中";
    public static final String FRIEND_IN_BLACKLIST_STR = "该随身画廊已经存在黑名单中";
    public static final String FRIEND_NOT_IN_BLACKLIST_STR = "该随身画廊不在黑名单中";
    public static final String DRAWING_NOT_EXISTS_STR = "作品不存在";
    public static final String DRAWING_NOT_EXISTS_OR_REMOVED_STR = "作品不存在或被删除";
    public static final String ALREADY_LIKE_TARGET_DRAWING_STR = "是不是已经赞过了？";
    public static final String ALREADY_FOLLOW_TARGET_UESR_STR = "是不是已经关注了？";
    public static final String ALREADY_SUBSCRIBE_TARGET_LABEL_STR = "是不是已经订阅了？";
    public static final String NO_SUBSCRIBE_TARGET_LABEL_STR = "你还未订阅该标签";
    public static final String CAN_NOT_FOLLOW_YOURSELF_STR = "不能关注你自己";
    public static final String ALREADY_COLLECT_TARGET_DRAWING_STR = "该作品已收藏";
    public static final String NO_COLLECT_TARGET_DRAWING_STR = "该画作不存在收藏中";
    public static final String NO_COLLECT_DRAWING_STR = "你还没有收藏任何画作";
    public static final String NO_FRIEND_STR = "你还没有关注任何随身画廊";
    public static final String LOGIN_ERROR_BLACKLIST = "该账号已被封";
    public static final String LOGIN_EXPIRED = "账号已过期，请重新登陆！";
    public static final String LOGIN_ERROR_BLOCKED = "该账号被屏蔽{0}天，请在{1}后再尝试登录";
    public static final String REQUEST_ERROR_USER_BLACKLIST = "你的账号已被封，无法进行操作";
    public static final String REQUEST_ERROR_USER_BLOCKED_COMMON = "你的账号被暂时屏蔽，无法进行操作";
    public static final String REQUEST_ERROR_USER_BLOCKED = "你的账号被屏蔽{0}天，请在{1}后再登录";
    public static final String USER_NAME_UNVALID_STR = "请换一个昵称吧～";
    public static final String USER_NAME_UPDATE_FAILD_STR = "修改昵称失败，请稍后再试";
    public static final String DRAWING_IS_NOT_YOURS = "亲～这幅作品是别人的，请尊重他人的劳动成果";
    public static final String DRAWING_NO_LIKE = "该作品尚未无点赞";
    public static final String DRAWING_NO_COMMENT = "该作品尚未无评论";
    public static final String COMMENT_NOT_EXISTS_STR = "评论不存在";
    public static final String LABEL_FORMAT_FAILED = "标签格式不正确";
    public static final String LABEL_COUNT_INVALID = "标签数量超过上限";
    public static final String LABEL_INVALID = "此标签含有敏感字～请重新输入";
    public static final String LABEL_REPEAT = "标签重复～请重新输入";
    public static final String LABEL_INSERT_FAILED = "该标签无法创建，请尝试其他标签";
    public static final String LABEL_FORMAT_FAILED_HAS_SPECIAL_CHARS = "标签中不能含有“#、@、*”";
    public static final String LABEL_INVALID_LENGTH = "标签不能超过15个字";
    public static final String LABEL_COUNT_INVALID_5 = "最多只能添加5个标签";
    public static final String POST_DRAWING_LABEL_REQUIRED = "请填写标签";
    public static final String AT_USER_COUNT_INVALID = "最多只能提醒10个人看";
    public static final String LABEL_USER_COUNT_INVALID_TYPE1 = "最多只能添加1个主标签";
    public static final String LABEL_USER_COUNT_INVALID_TYPE2 = "最多只能添加3个副标签";

    // 仅在测试环境使用
    public static final String REGISTER_PASSWORD_HAS_TELEPHONE = "密码中不能含有手机号";
    public static final String REGISTER_PASSWORD_HAS_NICK_NAME = "密码中不能含有昵称";
    public static final String REGISTER_PASSWORD_IN_TELEPHONE = "手机号中不能含有密码";
    public static final String REGISTER_PASSWORD_IN_NICK_NAME = "昵称中不能含有密码";
    public static final String REGISTER_USER_SUCCESS = "注册成功";
    public static final String REGISTER_USER_FAIL = "注册失败";
    public static final String LOGIN_USER_SUCCESS = "登陆成功";
    public static final String REGISTER_PASSWORD_TOO_SIMPLE = "你输入的密码过于简单，请更换密码";
    public static final String FORGET_PASSWORD_VERIFY_SMS_MSG = "你正在重置随身画廊账号密码，验证码：{0}，打死都不能告诉别人哦！";
    public static final String FORGET_PASSWORD_ACCOUNT_NOT_EXISTS = "账号不存在";
    public static final String FORGET_PASSWORD_ERROR_BLOCKED = "该账号被屏蔽{0}天，请在{1}后再尝试";
    public static final String COMMON_ERROR_BLOCKED = "该账号被暂时屏蔽";
    public static final String RESET_PASSWORD_SUCCESS = "密码重置成功，请重新登录";
    public static final String PUSH_TITLE_COMMENT = "'{0}'评论了你";
    public static final String PUSH_TITLE_COMMENT_REPLAY = "'{0}'在评论回复了你";
    public static final String PUSH_TITLE_FOLLOW = "'{0}'关注了你";
    public static final String PUSH_TITLE_LIKE = "'{0}'赞了你";
    public static final String PUSH_TITLE_AT_IN_DRAWING = "'{0}'提到了你";
    public static final String PUSH_CONTENT_COMMENT = "快去看看吧！";
    public static final String PUSH_CONTENT_FOLLOW = "快去看看吧！";
    public static final String PUSH_CONTENT_LIKE = "快去看看吧！";
    public static final String PUSH_CONTENT_AT_IN_DRAWING = "快去看看吧！";
    public static final String POST_DRAWING_FAILED = "作品发布失败，请重试";
    public static final String SHARE_TITLE_DRAWING = "{0}的作品 - {1}";
}
