package org.haotest.dao;

import org.apache.ibatis.annotations.Mapper;
import org.haotest.vo.TestTableVo;
@Mapper
public interface TestTableDao {
    void testTableInsert(TestTableVo tableVo);
}
