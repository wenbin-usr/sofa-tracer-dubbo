package edu.whpu;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("edu.whpu.mapper")
@EnableDubbo
public class GoodsApplication {
    public static void main( String[] args ) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}