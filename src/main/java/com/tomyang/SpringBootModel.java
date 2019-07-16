package com.tomyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auhor yc
 */
@EnableSwagger2
@SpringBootApplication
public class SpringBootModel {
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(SpringBootModel.class, args);
    }
}
