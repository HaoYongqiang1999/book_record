package org.example.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.example.domain.Record;

@Mapper
public interface RecordDao {
    @Insert("insert into tbl_record (update_time,book_name,operation) values(sysdate(),#{bookName},#{operation})")
    public int save(Record record);
}
