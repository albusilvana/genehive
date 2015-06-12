package com.Service;

import com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64;

import java.util.Date;
import java.util.Random;

/**
 * Created by silvana.albert on 5/25/15.
 */
public class TokenGenerator {
    public static String getToken(String username) {
        Random rand = new Random();
        String keySource = username + new Date() + rand.nextInt();
        byte[] tokenByte = new Base64(true).encodeBase64(keySource.getBytes());
        String token = new String(tokenByte);
        return token;
    }
}
