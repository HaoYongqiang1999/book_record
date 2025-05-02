package org.example;

import org.example.dao.RecordDao;
import org.example.domain.Record;
import org.example.service.RecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.sql.Date;
import java.util.List;

@SpringBootTest
class RecordsModuleApplicationTests {
    @Autowired
    private RecordDao recordDao;
    @Autowired
    private RecordService recordService;
    @Autowired
    DiscoveryClient discoveryClient;
    @Test
    public void testUpdateRecord() {
        Record record = new Record();
        record.setBookName("Java1");
        record.setOperation("update");
        assert recordDao.save(record) == 1;
    }
    @Test
    public void testRecordService() {
        Record record = new Record();
        record.setBookName("Java1");
        record.setOperation("Delete");
        assert recordService.addRecord(record);
    }
    @Test
    public void testDiscoveryClient() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
    }
}
