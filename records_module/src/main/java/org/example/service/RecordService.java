package org.example.service;
import org.springframework.transaction.annotation.Transactional;
import org.example.domain.Record;

@Transactional
public interface RecordService {
    public boolean addRecord(Record record);
}
