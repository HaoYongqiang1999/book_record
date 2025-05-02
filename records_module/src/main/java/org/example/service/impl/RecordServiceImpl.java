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
    public boolean addRecord(Record record) {
        System.out.println(record.toString());
        return recordDao.save(record) == 1;
    }
}
