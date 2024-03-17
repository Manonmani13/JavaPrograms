
package com.proretention.medical;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().paths(PathSelectors.ant("/api/medical/**"))
				.apis(RequestHandlerSelectors.basePackage("com.proretention.medical")).build()
				.apiInfo(apiDetails());

	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Medical Details Api", "Details about Medical", "1.0", "Terms and Condition",
				new springfox.documentation.service.Contact("medical", "http://localhost:8090/api/medical",
						"medical@gmail.com"),
				"Api License", "http://localhost:8090", Collections.emptyList());

	}
}
