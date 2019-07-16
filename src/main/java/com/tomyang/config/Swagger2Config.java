package com.tomyang.config;

import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * https://blog.csdn.net/weixin_41846320/article/details/82970204
 *
 * https://yq.aliyun.com/articles/622789
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * 对所有api扫描配置:controller路径
     */
    private static final String BASE_PACKAGE = "com.tomyang.ssm.controller";

    /**
     * Swagger2的配置文件：内容、扫描包等
     * @return Docket
     */
    @Bean
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     *
     * @return RequestMappingInfoHandlerMapping
     */
    public RequestMappingInfoHandlerMapping requestMapping(){
        return new RequestMappingHandlerMapping();
    }

    /**
     * 构建api文档的详细方法
     * @return ApiInfo
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //页面标题
                .title("Spring mvc 测试使用 Swagger2 构建Api")
                //创建人
                .contact(new Contact("name", "url", "email"))
                //版本号
                .version("1.0.0")
                //描述
                .description("API 描述")
                .build();
    }
}
