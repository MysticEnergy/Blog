package com.mystic.dao;

import com.mystic.pojo.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}