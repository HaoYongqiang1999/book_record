package org.example.service.impl;

import org.example.controller.Code;
import org.example.dao.BookDao;
import org.example.domain.Book;
import org.example.domain.Record;
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
    @Qualifier("myrestTemplate")
    private RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;
    public boolean save(Book book) {
        System.out.println("22222:" + loadBalancerClient.choose("records_module").getUri());
        String response = restTemplate.postForObject(
                "http://records_module/records/addRecord",
                new Record(null, null, "save", book.getName()),
                String.class
        );
        return bookDao.save(book) > 0;
    }

    public boolean update(Book book) {

//        ServiceInstance choose = loadBalancerClient.choose("service-product");
//        //远程URL
//        String url = "http://"+choose.getHost() +":" +choose.getPort() +"/product/"+productId;
//        log.info("远程请求：{}",url);
//        //2、给远程发送请求
//        Product product = restTemplate.getForObject(url, Product.class);
//        return product;
//        List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
//        System.out.println("RestTemplate 拦截器列表: " + interceptors);
//
//        System.out.println("11111:" + loadBalancerClient.choose("records-module").getUri());
        String url = "http://records-module/records/addRecord";
        String response = restTemplate.postForObject(
                url,
                new Record(null, null, "update", book.getName()),
                String.class
        );
//        System.out.println(restTemplate.getClass());
        return bookDao.update(book) > 0;
    }

    public boolean delete(Integer id) {
        restTemplate.postForObject(
                "http://records_module/records/addRecord",
                new Record(null, null, "delete", bookDao.getById(id).getName()),
                String.class
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
