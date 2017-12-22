package com.fastfood.school.service.init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerAPIInit {
	@Value("${enableAPI}")
	private boolean enable;
	
	@Bean
	public Docket getDocket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.enable(enable);
	}
	
	@Bean
	public ApiInfo getApiInfo(){
		return new ApiInfoBuilder()
				.title("素材工具API")
				.description("描述素材工具")
				.version("1.0")
				.build();
	}
	
}
