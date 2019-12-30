package com.yourena.gmall.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @GetMapping("/index")
    public String index(ModelMap modelMap) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("循环遍历" + i);
        }
        modelMap.put("list", list);
        modelMap.put("hello", "hello thymeleaf");
        return "index";
    }
}
