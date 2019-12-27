package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsBaseCatalog3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsBaseCatalog3Mapper extends BaseMapper<PmsBaseCatalog3Mapper> {
    @Select("select * from pms_base_catalog3 where catalog2_id = #{catalog2Id};")
    public List<PmsBaseCatalog3> selectListPmsBaseCatalog3(String catalog2Id);
}
