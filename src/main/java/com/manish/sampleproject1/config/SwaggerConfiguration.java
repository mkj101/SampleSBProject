package com.manish.sampleproject1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.google.common.base.Predicate;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.ApiInfo;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration extends WebMvcConfigurationSupport {

	    @Bean
	    public Docket postApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .apiInfo(apiInfo())
	        		.select()
	        		.paths(postPaths())
	        		.apis(RequestHandlerSelectors.basePackage("com.manish.sampleproject1.controller"))
	                .build();
	             
	    }
	    
	    @Bean
	    public Predicate<String> postPaths(){
	    	return or(regex("/api.*"),regex("/api/javainuse"));
	    }
	    
	    public ApiInfo apiInfo() {
	    	return new ApiInfoBuilder().title("Sample Project1")
	    			.description("Sampleproject1 reference for developer").version("1.0").build();
		}
	    
	  @Override
	    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html")
	                .addResourceLocations("classpath:/META-INF/resources/");
	 
	        registry.addResourceHandler("/webjars/**")
	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
	    }
	  
}
