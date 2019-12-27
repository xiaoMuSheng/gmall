package com.yourena.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yourena.gmall.bean.PmsProductInfo;
import com.yourena.gmall.service.SpuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
public class SpuController {
    @Reference
    private SpuService spuService;

    @PostMapping("/fileUpload")
    public String fileUpload(@RequestParam MultipartFile multipartFile){
        //将文件(图片、音频或视频)存储到分布式文件系统(fastDFS)

        return "success";
    }

    @GetMapping("/getSpuList")
    public List<PmsProductInfo> getSpuList(String catalog3Id) {
        return spuService.spuList(catalog3Id);
    }

    @PostMapping("/saveSpuInfo")
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo) {
        return "success";
    }

}
