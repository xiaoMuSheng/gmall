package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsProductInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsProductInfoMapper extends BaseMapper<PmsProductInfo> {

    @Select("select * from pms_product_info where catalog3_id = #{catalog3Id}")
    public List<PmsProductInfo> selectListPmsProductInfo(String catalog3Id);
}
