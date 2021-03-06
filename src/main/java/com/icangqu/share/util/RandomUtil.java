package com.icangqu.share.util;

import java.util.Random;


public class RandomUtil {

    /**
     * Random一定要全局共用，否则老版本的jdk，将会出现随机seed相同的问题
     */
    public static final Random RANDOM = new Random();
    /**
     * 字母数字（大小写区分）
     */
    private static String[] string_chars = new String[]{
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
            "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G",
            "H", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "W",
            "X", "Y", "Z"
    };
    /**
     * 纯数字
     */
    private static String[] number_chars = new String[]{
            "9", "5", "6", "7", "4", "2", "3", "1", "8", "0"
    };

    /**
     * 产生规定长度的随机字符串（由字母数字组成，大小写区分）
     *
     * @param strLength 需要的随机字符串的长度
     */
    public static String getRandomString(int strLength) {
        StringBuilder resString = new StringBuilder(strLength);
        for (int i = 0; i < strLength; i++) {
            resString.append(string_chars[RANDOM.nextInt(string_chars.length)]);
        }
        return resString.toString();
    }

    /**
     * 产生规定长度的纯数字随机字符串
     *
     * @param strLength 需要的随机字符串的长度
     */
    public static String getRandomNumberString(int strLength) {
        StringBuilder resString = new StringBuilder(strLength);
        for (int i = 0; i < strLength; i++) {
            resString.append(number_chars[RANDOM.nextInt(number_chars.length)]);
        }
        return resString.toString();
    }
}
