package edu.whpu;

import org.apache.dubbo.config.annotation.DubboService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("edu.whpu.mapper")
public class GoodsApplication {
    public static void main( String[] args ) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}