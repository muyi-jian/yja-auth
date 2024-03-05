package com.yj.system.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/3 9:15
 */

@Configuration
public class Knife4jConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("后台管理系统-API文档")
                        .version("1.0")
                        .description("后台管理系统-API文档(springboot3)")
                        .contact(new Contact().name("YJA-AUTH").email("2628168756@qq.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("[YJA-AUTH]接口文档"));
    }

    // 配置文档分组1
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("admin-api")
                .pathsToMatch("/admin/**")
                .build();
    }
}
