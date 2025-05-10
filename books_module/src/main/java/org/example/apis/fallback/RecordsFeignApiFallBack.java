package org.example.apis.fallback;

import org.example.apis.RecordsFeignApi;
import org.example.domain.Record;
import org.example.domain.Result;
import org.springframework.stereotype.Component;

@Component
public class RecordsFeignApiFallBack implements RecordsFeignApi {
    @Override
    public Result getBookRecord(Record record) {
        return new Result(599, null, "fallback...");
    }
}
