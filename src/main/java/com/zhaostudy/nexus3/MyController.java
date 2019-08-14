package com.zhaostudy.nexus3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/test")
@ResponseBody
public class MyController {

    @RequestMapping("/test")
    public String packageJar() {
        System.out.println("packageJar已进入");
        return "packageJar已进入";
    }


}
