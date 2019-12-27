package com.yourena.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yourena.gmall.bean.PmsBaseAttrInfo;
import com.yourena.gmall.bean.PmsBaseAttrValue;
import com.yourena.gmall.bean.PmsProductSaleAttr;
import com.yourena.gmall.service.AttrService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin
public class AttrController {

    @Reference
    private AttrService attrService;

    @GetMapping("/getBaseSaleAttrList")
    public List<PmsProductSaleAttr> baseAttrInfoList(){
        return attrService.baseAttrInfoList();
    }

    @GetMapping("/getAttrInfo")
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        return attrService.attrInfoList(catalog3Id);
    }

    @GetMapping("/getAttrValue")
    public List<PmsBaseAttrValue> attrValueList(String attrId) {
        return attrService.attrValueList(attrId);
    }

    @PostMapping("/saveAttrInfo")
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
        return attrService.saveAttrInfo(pmsBaseAttrInfo);
    }

    @GetMapping("/getAttrValueListByValueId")
    public List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> value) {
        return attrService.getAttrValueListByValueId(value);
    }
}
