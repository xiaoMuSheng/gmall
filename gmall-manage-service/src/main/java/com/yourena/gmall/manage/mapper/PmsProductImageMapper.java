package com.yourena.gmall.manage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yourena.gmall.bean.PmsProductImage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface PmsProductImageMapper extends BaseMapper<PmsProductImage> {
}
