package com.yourena.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yourena.gmall.bean.PmsBaseCatalog1;
import com.yourena.gmall.bean.PmsBaseCatalog2;
import com.yourena.gmall.bean.PmsBaseCatalog3;
import com.yourena.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.yourena.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.yourena.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import com.yourena.gmall.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> GetCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalog1Mapper.selectListPmsBaseCatalog1();
        System.out.println(pmsBaseCatalog1s);
        return pmsBaseCatalog1Mapper.selectListPmsBaseCatalog1();
    }

    @Override
    public List<PmsBaseCatalog2> GetCatalog2(String catalog1Id) {
        return pmsBaseCatalog2Mapper.selectListPmsBaseCatalog2(catalog1Id);
    }

    @Override
    public List<PmsBaseCatalog3> GetCatalog3(String catalog2Id) {
        return pmsBaseCatalog3Mapper.selectListPmsBaseCatalog3(catalog2Id);
    }
}
