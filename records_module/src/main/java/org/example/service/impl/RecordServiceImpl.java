package org.example.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.dao.RecordDao;
import org.example.properties.RecordProperties;
import org.example.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.domain.Record;

@Slf4j
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    @Autowired
    private RecordProperties recordProperties;
    public boolean addRecord(Record record) {
        boolean state = recordDao.save(record) == 1;
        System.out.println(recordProperties.getEmpEmail() + ": 你好！ 接口调用" + (state ? "成功" : "失败"));
        return state;
    }
}
