package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsSkuAttrValue;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PmsSkuAttrValueMapper extends BaseMapper<PmsSkuAttrValue> {
}
