package com.example.urlshort;

import com.example.urlshort.core.Alg;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    private String charset = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @Test
    public void base62Test(){
        HashMap<String,Integer> map = new HashMap<>();
        try{
            char[] charArr = charset.toCharArray();
            Alg al = new Alg(charArr);
            for(int i=0;i<10;i++){
                String upat = al.getBase62();
                map.put(upat,i);
            }
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println("["+entry.getValue()+"]"+entry.getKey()+"");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
