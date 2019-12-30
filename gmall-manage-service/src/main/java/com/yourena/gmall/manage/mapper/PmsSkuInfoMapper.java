package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsSkuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsSkuInfoMapper extends BaseMapper<PmsSkuInfo> {

    List<PmsSkuInfo> selectSkuSaleAttrValueListBySpu(String productId);

}
