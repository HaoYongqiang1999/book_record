package org.example.service;

import org.example.domain.Book;
import org.haotest.service.TestTableService;
import org.haotest.service.hello;
import org.haotest.service.impl.TestTableServiceImpl;
import org.haotest.vo.TestTableVo;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.*;

@SpringBootTest
@Import(org.haotest.config.TestTableModuleConfiguration.class)
@MapperScan("org.haotest.dao")
public class BookServiceTest {
//    @TestConfiguration
//    static class TestConfig {
//        @Bean
//        TestTableService testTableService() {
//            return new TestTableServiceImpl();
//        }
//    }
    @Autowired
    private BookService bookService;
    @Autowired
    private  TestTableService testTableService;
    @Test
//    注解：表名，主键，字段定义
    public void testGetById(){
        String tableConfig = "tbl_book(id,type):id-int-0,type-varchar-20,name-varchar-50,description-varchar-255";
        String queryParams = "id,type";
//        hello1.sayHello();
        List<Object> queryParamList = new ArrayList<>();
        TestTableVo tableVo = testTableService.testTableInsert(tableConfig, queryParams, queryParamList);
        Book book = bookService.getById((Integer) queryParamList.get(0));
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

}
