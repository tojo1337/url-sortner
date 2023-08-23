package com.example.urlshort.restmapper;

import com.example.urlshort.core.Alg;
import com.example.urlshort.data.PassData;
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
    public PassData sortUrl(@RequestBody PassData url){
        /*
        * Do some checking before returning back the value
        * Some checking like if the input is matching with the default url pattern is required
        * then return back the data using post method
        * use regex to check the input url format
        * */
        Alg al = new Alg(charset);
        String hashData = al.getMd5(url.getData());
        map.put(hashData,url.getData());
        url.setData(hashData);
        return url;
    }
    @GetMapping("/{data}")
    public RedirectView redirectFunc(@PathVariable String data){
        RedirectView rev = new RedirectView();
        String url = map.get(data);
        rev.setUrl(url);
        return rev;
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
