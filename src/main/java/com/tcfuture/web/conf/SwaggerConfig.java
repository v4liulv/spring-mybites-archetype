package com.tcfuture.web.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

/**
 * Swagger UI 配置
 *
 * @author bigdata@tcfuture.tech
 * @since 2020/3/29
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        // apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("spring-mybatis")
                .description("Spring Mybatis 框架.")
                .license("Apache Licence 2")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                // select()函数返回一个ApiSelectorBuilder实例
                .select()
                // 决定了暴露哪些接口给 Swagger
                .paths(any())
                .build();
    }

}
