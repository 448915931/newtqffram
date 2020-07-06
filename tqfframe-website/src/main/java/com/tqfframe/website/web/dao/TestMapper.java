package com.tqfframe.website.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tqfframe.website.web.vo.TestDTO;
import com.tqfframe.website.web.entry.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Tang-QiFeng on 2020/6/30
 */

@Mapper
public interface  TestMapper extends BaseMapper<TestEntity> {
    IPage<TestDTO> getPageByName(IPage page, @Param("name") String name);
}
