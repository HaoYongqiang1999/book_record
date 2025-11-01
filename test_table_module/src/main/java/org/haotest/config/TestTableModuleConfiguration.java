package org.haotest.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.haotest.service.TestTableService;
import org.haotest.service.impl.TestTableServiceImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

//@Configuration
//@ComponentScan(basePackages = "org.haotest")
//@MapperScan("org.haotest.dao") // SDK 自己的 Mapper 包
//@MapperScan(basePackages = {
//        "org.haotest.dao"     // SDK 自身的 DAO
//        ,"org.example.dao"      // 主工程的 DAO
//})
//public class TestTableModuleConfiguration {
//}

@Configuration
//@ComponentScan(basePackages = "org.haotest.service")
//@MapperScan(basePackages = "org.haotest.dao", sqlSessionFactoryRef = "sdkSqlSessionFactory")
public class TestTableModuleConfiguration {

    @Bean
    public TestTableService testTableService () {
        return new TestTableServiceImpl();
    }
}
