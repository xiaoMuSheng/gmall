package com.yourena.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yourena.gmall.bean.PmsBaseCatalog1;
import com.yourena.gmall.bean.PmsBaseCatalog2;
import com.yourena.gmall.bean.PmsBaseCatalog3;
import com.yourena.gmall.service.CatalogService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @GetMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogService.GetCatalog1();
    }

    @GetMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id) {
        return catalogService.GetCatalog2(catalog1Id);
    }

    @GetMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id) {
        return catalogService.GetCatalog3(catalog2Id);
    }
}
