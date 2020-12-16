package com.smfst.xcw.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration //声明该类为配置类
@EnableSwagger2 //声明启动Swagger2
public class SwaggerConfig {

//    @Bean
//    public Docket smftDocket() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("smft")
//                .genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.smfst.xcw.controller"))
//                .paths(PathSelectors.any())
//                .build().apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("智慧制造沙盘系统接口")
//                .description("智慧制造沙盘系统接口管理")
//                .termsOfServiceUrl("/Situation/")
//                .contact(new Contact("xcw", "", ""))
//                .license("智慧制造沙盘 License")
//                .licenseUrl("#")
//                .version("1.0")
//                .build();
//    }


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.smfst.xcw.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("智慧制造沙盘系统接口")
                .description("智慧制造沙盘系统接口管理")
                .termsOfServiceUrl("")
                .contact("522076290@qq.com")
                .license("智慧制造沙盘 License")
                .licenseUrl("#")
                .version("1.0")
                .build();
    }


}
