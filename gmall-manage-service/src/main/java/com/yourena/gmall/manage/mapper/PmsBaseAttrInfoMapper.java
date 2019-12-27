package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsBaseAttrInfo;
import com.yourena.gmall.bean.PmsProductSaleAttr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsBaseAttrInfoMapper extends BaseMapper<PmsBaseAttrInfo> {

    @Select("select * from pms_base_attr_info where catalog3_id = #{catalog3Id};")
    public List<PmsBaseAttrInfo> selectListPmsBaseAttrInfo(String catalog3Id);

    @Select("select * from pms_product_sale_attr;")
    public List<PmsProductSaleAttr> selectBaseAttrInfo();
}
