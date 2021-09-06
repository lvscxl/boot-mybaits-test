package com.zp.order.mapper.mapping.other;

import com.zp.order.entity.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SchoolOtherMapper {

  List<School> querySchools();
}
