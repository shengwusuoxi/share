package com.icangqu.share.util.security;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

import java.security.Security;

/**
 * AES加密解密工具<br> 依赖bouncycastle支持
 */
public class AESTool {
    static {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
    }

    private static byte[]
            initVector =
            {0x32, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x38, 0x27, 0x36, 0x35, 0x33, 0x23, 0x32,
                    0x31};

    /**
     * 检查AES秘钥是否有效<br> 秘钥长度只能是：32（256字节）/24（192字节）/16（128字节）
     * @return 返回null表示 秘钥正确；否则就是对应的错误
     */
    public static String validateKey(String key) {
        if (key == null) {
            return "key !";
        }
        byte[] keyBytes = key.getBytes();
        if (keyBytes.length != 32 && keyBytes.length != 24 && keyBytes.length != 16) {
            return "key length must be 128/192/256 bits!";
        }
        return null;
    }

    /**
     * Encrypt the content with a given key using aes algorithm.
     *
     * @param key must contain exactly 32 characters
     */
    public static String encrypt(byte[] originalData, String key) throws Exception {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null!");
        }
        String encrypted = null;
        byte[] keyBytes = key.getBytes();
        if (keyBytes.length != 32 && keyBytes.length != 24 && keyBytes.length != 16) {
            throw new IllegalArgumentException("Key length must be 128/192/256 bits!");
        }
        byte[] encryptedBytes = null;
        encryptedBytes = encrypt(originalData, keyBytes, initVector);
        encrypted = Base64Encoder.encode(encryptedBytes, false);
        return encrypted;
    }

    /**
     * Decrypt the content with a given key using aes algorithm.
     *
     * @param key must contain exactly 32 characters
     */
    public static String decrypt(String encryptString, String key) throws Exception {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null!");
        }
        String decrypted = null;
        byte[] encryptedContent = Base64Decoder.decodeToBytes(encryptString);
        byte[] keyBytes = key.getBytes();
        byte[] decryptedBytes = null;
        if (keyBytes.length != 32 && keyBytes.length != 24 && keyBytes.length != 16) {
            throw new IllegalArgumentException("Key length must be 128/192/256 bits!");
        }
        decryptedBytes = decrypt(encryptedContent, keyBytes, initVector);
        decrypted = new String(decryptedBytes);
        return decrypted;
    }

    /**
     * Encrypt data.
     */
    public static byte[] encrypt(byte[] originalData, byte[] key, byte[] iv)
            throws Exception {
        PaddedBufferedBlockCipher
                aes =
                new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
        CipherParameters ivAndKey = new ParametersWithIV(new KeyParameter(key), iv);
        aes.init(true, ivAndKey);
        return cipherData(aes, originalData);
    }

    /**
     * Decrypt data.
     */
    public static byte[] decrypt(byte[] encryptData, byte[] key, byte[] iv)
            throws Exception {
        PaddedBufferedBlockCipher
                aes =
                new PaddedBufferedBlockCipher(new CBCBlockCipher(new AESFastEngine()));
        CipherParameters ivAndKey = new ParametersWithIV(new KeyParameter(key), iv);
        aes.init(false, ivAndKey);
        return cipherData(aes, encryptData);
    }

    /**
     * Encrypt or decrypt data.
     */
    private static byte[] cipherData(PaddedBufferedBlockCipher cipher, byte[] originalData)
            throws Exception {
        int minSize = cipher.getOutputSize(originalData.length);
        byte[] outBuf = new byte[minSize];
        int length1 = cipher.processBytes(originalData, 0, originalData.length, outBuf, 0);
        int length2 = cipher.doFinal(outBuf, length1);
        int actualLength = length1 + length2;
        byte[] result = new byte[actualLength];
        System.arraycopy(outBuf, 0, result, 0, result.length);
        return result;
    }
}