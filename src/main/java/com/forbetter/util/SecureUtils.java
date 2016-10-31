/*
 * 文件名：SecureUtils
 * 版权：Copyright by lichen
 * 描述：
 * 修改人：lichen
 * 修改时间：2016/10/31
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */
package com.forbetter.util;


import java.security.SecureRandom;


/**
 * 安全随机函数
 * <p>
 * Created On 2016年-10月-31日 17:21
 *
 * @author lichen
 * @version 1.0
 */
public class SecureUtils {

    private static SecureRandom random = new SecureRandom();

    /**
     * 生成随机salt
     *
     * @param salt salt数组
     * @return salt字符串
     */
    public static String generalSecureKey(byte[] salt) {
        random.nextBytes(salt);
        return byte2Hex(salt);
    }

    /**
     * 将二进制转换成16进制
     *
     * @param buf 字节数组
     * @return 16进制字符串
     */
    private static String byte2Hex(byte[] buf) {
        StringBuilder sb = new StringBuilder();
        for (byte b : buf) {
            String hex = Integer.toHexString(b & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 将16进制转换为二进制
     *
     * @param str 16进制字符串
     * @return 字节数组
     */
    public static byte[] hex2Byte(String str) {
        if (str.length() < 1)
            return null;
        byte[] result = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int high = Integer.parseInt(str.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(str.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}
