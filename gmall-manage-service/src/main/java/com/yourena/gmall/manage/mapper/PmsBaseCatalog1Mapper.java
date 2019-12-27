package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsBaseCatalog1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsBaseCatalog1Mapper extends BaseMapper<PmsBaseCatalog1Mapper> {
    @Select("select * from pms_base_catalog1;")
    public List<PmsBaseCatalog1> selectListPmsBaseCatalog1();
}
