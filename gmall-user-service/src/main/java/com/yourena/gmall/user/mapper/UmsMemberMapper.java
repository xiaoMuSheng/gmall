package com.yourena.gmall.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UmsMemberMapper extends BaseMapper<UmsMember> {

    @Select("select * from ums_member")
    List<UmsMember> getUserList();

}
