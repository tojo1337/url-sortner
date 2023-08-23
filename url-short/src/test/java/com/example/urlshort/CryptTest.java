package com.example.urlshort;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

public class CryptTest {
    @Test
    public void testEncrypt(){
        try{
            HashMap<String,String> map = new HashMap<>();
            MessageDigest mdigest = MessageDigest.getInstance("md5");
            String[] u1 = {"https://docs.oracle.com/javase/8/docs/api/java/security/MessageDigest.html",
                        "https://docs.oracle.com/javase/8/docs/api/java/security/MessageDigest.html#getInstance-java.lang.String-",
                        "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#MessageDigest",
                        "https://docs.oracle.com/javase/8/docs/api/java/security/MessageDigest.html"};
            for(String url:u1){
                byte[] arr = mdigest.digest(url.getBytes());
                BigInteger no = new BigInteger(1,arr);
                String hashStr = no.toString(16);
                while(hashStr.length()<32){
                    hashStr = "0"+hashStr;
                }
                map.put(hashStr.substring(0,10),url);
            }
            String hashVal = "f332849266";
            for(Map.Entry<String,String> entry:map.entrySet()){
                //if(entry.getKey().equals(hashVal)){
                    System.out.println("Entry : "+entry.getKey()+" for : "+entry.getValue());
                //}
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
