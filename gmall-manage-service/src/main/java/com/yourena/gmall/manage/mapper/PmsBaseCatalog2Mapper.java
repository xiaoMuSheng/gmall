package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsBaseCatalog2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsBaseCatalog2Mapper extends BaseMapper<PmsBaseCatalog2Mapper> {
    @Select("select * from pms_base_catalog2 where catalog1_id = #{catalog1Id};")
    public List<PmsBaseCatalog2> selectListPmsBaseCatalog2(String catalog1Id);
}
