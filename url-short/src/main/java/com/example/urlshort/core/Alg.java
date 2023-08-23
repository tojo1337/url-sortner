package com.example.urlshort.core;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;

public class Alg {
    private char[] arr;
    public Alg(char[] arr){
        this.arr = arr;
    }
    public String getMd5(String data){
        String hashStr = "";
        try{
            MessageDigest mdig = MessageDigest.getInstance("md5");
            byte[] digest = mdig.digest(data.getBytes());
            BigInteger no = new BigInteger(1,digest);
            hashStr = no.toString(16);
            while(hashStr.length()<32){
                hashStr = "0"+hashStr;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return hashStr.substring(0,10);
    }
    public String getBase62(){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        try{
            for(int i=0;i<10;i++){
                sb.append(arr[rand.nextInt(arr.length)]);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
