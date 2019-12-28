package com.yourena.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yourena.gmall.bean.PmsProductImage;
import com.yourena.gmall.bean.PmsProductInfo;
import com.yourena.gmall.manage.util.PmsUploadUtil;
import com.yourena.gmall.service.SpuService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
public class SpuController {
    @Reference
    private SpuService spuService;
    private List<PmsProductInfo> pmsProductInfos;

    @PostMapping("/fileUpload")
    public String fileUpload(@RequestParam MultipartFile multipartFile) {
        System.out.println(multipartFile);
        //将文件(图片、音频或视频)存储到分布式文件系统(fastDFS)
        String url = PmsUploadUtil.uploadImage(multipartFile, "/tracker.conf");
        System.out.println(url);
        return url;
    }

    @GetMapping("/spuSaleAttrList")
    public List<PmsProductInfo> spuSaleAttrList(String spuId) {
        pmsProductInfos = spuService.spuList(spuId);
        return pmsProductInfos;
    }

    @GetMapping("/getSpuList")
    public List<PmsProductInfo> getSpuList(String catalog3Id) {
        return spuService.spuList(catalog3Id);
    }

    @PostMapping("/saveSpuInfo")
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo) {
        return "success";
    }

    @GetMapping("/spuImageList")
    public List<PmsProductImage> spuImageList(String spuId) {
        List<PmsProductImage> pmsProductImage = spuService.spuImageList(spuId);
        return pmsProductImage;
    }

}
