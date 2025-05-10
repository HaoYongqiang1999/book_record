package org.example.apis;

import org.example.apis.fallback.RecordsFeignApiFallBack;
import org.example.domain.Record;
import org.example.domain.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "gateway-module", fallback = RecordsFeignApiFallBack.class)
//@FeignClient("records-module")
public interface RecordsFeignApi {
    @PostMapping("/records/addRecord")
    public Result getBookRecord(@RequestBody Record record);
}
