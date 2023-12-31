package com.example.urlshort.restmapper;

import com.example.urlshort.core.Alg;
import com.example.urlshort.data.PassData;
import com.example.urlshort.data.RedirectData;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.HashMap;

@RestController
public class RequestMapping {
    private char[] charset = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                            '1','2','3','4','5','6','7','8','9','0'};
    private HashMap<String,String> map = new HashMap<>();
    @PostMapping("/sort")
    @CrossOrigin(origins = "http://localhost:3000")
    public PassData sortUrl(@RequestBody PassData url){
        /*
        * Do some checking before returning back the value
        * Some checking like if the input is matching with the default url pattern is required
        * then return back the data using post method
        * use regex to check the input url format
        * */
        Alg al = new Alg(charset);
        String hashData = al.getMd5(url.getData());
        String value = url.getData();
        if(!(map.get(hashData)==null)){
            if(map.get(hashData).equals(url.getData())){
                url.setData(hashData);
            }else {
                while(true){
                    String newHashData = al.getBase62();
                    if(map.get(newHashData)==null){
                        System.out.println("Colliding data : "+url.getData());
                        url.setData(newHashData);
                    }
                }
            }
        }else {
            url.setData(hashData);
        }
        String key = url.getData();
        map.put(key,value);
        return url;
    }
    /*
    @GetMapping("/{data}")
    public RedirectView redirectFunc(@PathVariable String data){
        RedirectView rev = new RedirectView();
        String url = map.get(data);
        rev.setUrl(url);
        return rev;
    }
    */
    @PostMapping("/data")
    @CrossOrigin(origins = "http://localhost:3000")
    public PassData fetchedData(@RequestBody PassData data){
        PassData urlObj = new PassData();
        String url = map.get(data.getData());
        if(!url.isEmpty()){
            urlObj.setData(url);
        }else {
            urlObj.setData("Not found");
        }
        return urlObj;
    }
    @GetMapping("/list")
    public String number(){
        int num = charset.length;
        StringBuilder sb = new StringBuilder();
        for(char ch:charset){
            sb.append(ch);
        }
        return "[*]Size is : "+num+"<br>Set : "+sb.toString();
    }
}
