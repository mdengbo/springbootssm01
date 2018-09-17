package com.example.springbootssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务
@MapperScan("com.example.springbootssm.dao")//  **mapper  扫描 和 dao @mapper 选一个即可
public class SpringbootssmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootssmApplication.class, args);
    }
}
