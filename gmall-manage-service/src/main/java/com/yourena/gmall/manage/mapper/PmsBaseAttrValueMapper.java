package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsBaseAttrValue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PmsBaseAttrValueMapper extends BaseMapper<PmsBaseAttrValue> {

    @Select("select * from pms_base_attr_value  where attr_id = #{attrId};")
    public List<PmsBaseAttrValue> selectPmsBaseAttrValueList(String attrId);
}
