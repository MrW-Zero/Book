package com.wztcode.base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Base64Test {
    public static void main(String[] args) throws IOException {

        String content = "这是需要 Base64 编码的内容";
        // 编码
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String encodedString = base64Encoder.encode(content.getBytes(StandardCharsets.UTF_8));
        System.out.println(encodedString);
        // 解码
        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] decodeBuffer = base64Decoder.decodeBuffer(encodedString);
        String str = new String(decodeBuffer, "UTF-8");
        System.out.println(str);
    }
}
