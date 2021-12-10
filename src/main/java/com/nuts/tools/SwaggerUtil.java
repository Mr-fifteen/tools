package com.nuts.tools;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
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

    //多个文件位置得配置方法
//    {
//            // 定义分隔符
//            private static final String splitor = ";";
//
//            @Bean
//            public Docket createRestApi() {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .apiInfo(apiInfo())
//                    .ignoredParameterTypes(ApiIgnore.class)
//                    .groupName("datamanager")
//                    .select()
//                    //.apis(RequestHandlerSelectors.basePackage("com.nuts.workorder;com.nuts.collect;com.nuts.home"))
//                    .apis(basePackage("com.nuts.workorder;com.nuts.collect;com.nuts.home"))
//                    .paths(PathSelectors.any())
//                    .build();
//        }
//
//
//            private ApiInfo apiInfo() {
//            return new ApiInfoBuilder()
//                    .title("数据管理接口列表")
//                    .description("数据管理")
//                    .version("1.0")
//                    .build();
//        }
//
//            public static Predicate<RequestHandler> basePackage(final String basePackage) {
//            return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
//        }
//
//            private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
//            return input -> {
//                // 循环判断匹配
//                for (String strPackage : basePackage.split(splitor)) {
//                    boolean isMatch = input.getPackage().getName().startsWith(strPackage);
//                    if (isMatch) {
//                        return true;
//                    }
//                }
//                return false;
//            };
//        }
//
//            private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
//            return Optional.fromNullable(input.declaringClass());
//        }
//    }


}
