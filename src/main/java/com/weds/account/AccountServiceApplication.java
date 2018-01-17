package com.weds.account;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import com.weds.framework.core.annotation.MyBatisDao;
import com.weds.framework.core.basic.web.RestExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.weds.account.dao", annotationClass = MyBatisDao.class)
@EnableTransactionManagement
public class AccountServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
    }

    @Bean
    public RestExceptionHandler restExceptionHandler() {
        return new RestExceptionHandler();
    }

    @Bean
    public Module jacksonAfterBurnerModule() {
        return new AfterburnerModule();
    }

    @Bean
    public HttpMessageConverter httpSmileJackson2MessageConverter() {
        return new AbstractJackson2HttpMessageConverter(
                new ObjectMapper(new SmileFactory()).registerModule(new AfterburnerModule())) {
        };
    }
}
