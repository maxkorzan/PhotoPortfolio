package com.max.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/gallery")
    public String gallery(){
        return "gallery";
    }

    @RequestMapping("/gallery2")
    public String gallery2(){
        return "gallery2";
    }

    @RequestMapping("/transamerica")
    public String transamerica(){
        return "transamerica";
    }

    @RequestMapping("/portrait")
    public String portrait(){
        return "portrait";
    }

    @RequestMapping("/natparks")
    public String natparks(){
        return "natparks";
    }



}
