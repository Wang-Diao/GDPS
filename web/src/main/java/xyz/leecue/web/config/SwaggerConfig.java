package xyz.leecue.web.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LeeCue
 * @date 2021-03-20
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        //如果配置多个多个文档，那么需要配置groupName来分组标识。
        return new Docket(DocumentationType.SWAGGER_2)
                //生成API相关信息
                .apiInfo(apiInfo())
                //select函数返回一个ApiSelectBuilder实例，用来控制接口被Swagger做成文档
                .select()
                // 用于指定扫描哪个包下的接口
                .apis(RequestHandlerSelectors.basePackage("xyz.leecue.web.controller"))
                // 选择所有的API,如果你想只为部分API生成文档，可以配置这里
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //  可以用来自定义API的主标题
                .title("企业云盘项目API")
                // 可以用来描述整体的API
                .description("企业云盘项目SwaggerAPI管理")
                // 用于定义服务的域名
                .termsOfServiceUrl("leecue.xyz")
                // 可以用来定义版本。
                .version("1.0")
                .build();
    }
}
