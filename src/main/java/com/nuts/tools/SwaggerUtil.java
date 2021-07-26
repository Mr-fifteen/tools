package com.nuts.tools;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author liuwenxv
 * @date 2021/7/26 15:45
 * @comment
 */
@Configuration
public class SwaggerUtil {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lzr.test.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder()
                        .title("Tools")
                        .description("工具人之家")
                        .version("1.0")
                        .contact(new Contact("张张张","https:www.baidu.com","****@qq.com")
                        )
                        .license("The Apache License")
                        .licenseUrl("https:www.baidu.com")
                        .build());
    }
}
