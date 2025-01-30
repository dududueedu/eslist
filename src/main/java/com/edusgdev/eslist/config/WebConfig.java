package com.edusgdev.eslist.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class WebConfig {
		
	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.edusgdev.eslist"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaDados());
	}
	
	@SuppressWarnings("rawtypes")
	private ApiInfo metaDados() {
		ApiInfo apiInfo = new ApiInfo(
					"API REST - ESlist",
					"API REST - Lista de Jogos",
					"Versão: 1.0",
					"Terms of Service",
					new Contact("Eduardo da Silva Gomes", "https://www.linkedin.com/in/dududueedu/", "eduardooffside@gmail.com"),
					"Apache License Version 2.0",
					"https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}
	
	@Value("${cors.origins}")
	private String corsOrigins;

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins(corsOrigins)
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
    

}