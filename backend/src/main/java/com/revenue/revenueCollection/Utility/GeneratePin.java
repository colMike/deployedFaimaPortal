package com.revenue.revenueCollection.Utility;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class GeneratePin {

  //    @Asynchronous
  public static String get_SHA_512_Pin(String agentId, String plainPin) {
    String strKey = "secret";
    String plainString = agentId + plainPin;
    byte[] byteArray = Base64.getEncoder().encode(plainString.getBytes());
    String encodedString = new String(byteArray);
    String HMAC_SHA512 = "HmacSHA512";
    String DEFAULT_ENCODING = "UTF-8";
    byte[] result = null;

    // Hash Algorithm
    try {
      SecretKeySpec keySpec = new SecretKeySpec(strKey.getBytes(DEFAULT_ENCODING), HMAC_SHA512);
      Mac mac = Mac.getInstance(HMAC_SHA512);
      mac.init(keySpec);
      result = mac.doFinal(encodedString.getBytes(DEFAULT_ENCODING));

    } catch (Exception ex) {
      System.out.println("Unable to Generate Password");
    }

    StringBuilder sb = new StringBuilder();
    for (byte b : result) {
      sb.append(String.format("%02X", b));
    }

    return sb.toString().toLowerCase();
  }

//  public static


  public static void main(String[] args) {

    String ans = get_SHA_512_Pin("1", "1111");
    System.out.println(ans);

  }
}
