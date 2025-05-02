package org.example.contoller;

import org.example.domain.Record;
import org.example.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/records")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @GetMapping
    public Object hello(){
        return "hello";
    }
    @PostMapping("/addRecord")
    public Object getBookRecord(@RequestBody Record record) {
        return recordService.addRecord(record) ? "success" : "fail";
    }
}
