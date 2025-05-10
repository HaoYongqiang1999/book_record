package org.example.contoller;

import org.example.domain.Record;
import org.example.domain.Result;
import org.example.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/records")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @GetMapping
    public Object hello(){
        return "hello";
    }
    @PostMapping("/addRecord")
    public Result getBookRecord(@RequestBody Record record) {
        boolean bol= recordService.addRecord(record);
        return new Result( bol ? 200: 500, null,  bol ? "成功！" : "失败！");
    }
}
