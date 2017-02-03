package com.mystic.dao;

import com.mystic.pojo.blog;

public interface blogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(blog record);

    int insertSelective(blog record);

    blog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(blog record);

    int updateByPrimaryKey(blog record);
}