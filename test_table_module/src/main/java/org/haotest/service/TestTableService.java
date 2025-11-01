package org.haotest.service;

import org.haotest.vo.TestTableVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TestTableService {
    TestTableVo testTableInsert(String tableConfig, String queryParams, List<Object> queryValues);
    void testTableDelete(TestTableVo tableVo);
}
