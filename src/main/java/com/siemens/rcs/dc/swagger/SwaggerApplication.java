package com.siemens.rcs.dc.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@Configuration
public class SwaggerApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SwaggerApplication.class);
		application.run(args);
	}

	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { 
			"classpath:/META-INF/resources/",
			"classpath:/static/" };

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
	}
}
