package com.accp.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 
 * WebMvcConfigurationSupport等价于以前的spring-mvc.xml
 * WebMvcConfigurationSupport:当如果没有自定web配置时， 使用此类初始springmvc配置
 * 
 * 
 * @Configuration:标注此类为配置，覆盖此类继承的类的配置
 * 	 addResourceHandlers:添加静态资源
 * 	 configureMessageConverters:配置消息转换器的
 * @author admin
 *
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
		.addResourceLocations("classpath:/static/")
		.addResourceLocations("file:d://images/")
		;
	}

	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		super.configureMessageConverters(converters);
	}
	
	

}
