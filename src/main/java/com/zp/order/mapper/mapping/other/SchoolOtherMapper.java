package com.zp.order.mapper.mapping.other;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zp.order.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SchoolOtherMapper extends BaseMapper<School> {

  List<School> querySchools();

  Page<School> querySchoolByPage(@Param("page") Page page);

}
