package org.example.service.impl;

import org.example.apis.RecordsFeignApi;
import org.example.controller.Code;
import org.example.dao.BookDao;
import org.example.domain.Book;
import org.example.domain.Record;
import org.example.domain.Result;
import org.example.exception.BusinessException;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.ServiceInstanceChooser;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private RecordsFeignApi recordsFeignApi;
    public boolean save(Book book) {
        recordsFeignApi.getBookRecord(
                new Record(null, null, "save", book.getName())
        );
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {
        Result result= recordsFeignApi.getBookRecord(
                new Record(null, null, "update", book.getName())
        );
        System.out.println(result);
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        recordsFeignApi.getBookRecord(
                new Record(null, null, "delete", bookDao.getById(id).getName())
        );
        return bookDao.delete(id) > 0;
    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
