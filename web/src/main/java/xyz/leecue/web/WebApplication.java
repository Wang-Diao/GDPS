package xyz.leecue.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LeeCue
 * @date 2021-03-17
 */
@SpringBootApplication(scanBasePackages = "xyz.leecue")
@MapperScan(basePackages = "xyz.leecue.dao")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
