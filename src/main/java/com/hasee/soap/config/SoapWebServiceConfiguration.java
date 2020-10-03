package com.hasee.soap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebServiceConfiguration extends WsConfigurerAdapter
{
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/stars-service/*");
	}

	@Bean
	public XsdSchema userSchema() {
		return new SimpleXsdSchema(new ClassPathResource("users.xsd"));
	}

	@Bean(name = "validatePassenger")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userSchema) {

		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setSchema(userSchema);
		definition.setLocationUri("/stars-service/validatePassenger");
		definition.setPortTypeName("ValidatePassengerPort");
		definition.setTargetNamespace("http://hasee.com/soap-demo");
		return definition;
	}

	@Bean(name = "createApplication")
	public DefaultWsdl11Definition defaultWsdl11Definition2(XsdSchema userSchema) {

		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setSchema(userSchema);
		definition.setLocationUri("/stars-service/createApplication");
		definition.setPortTypeName("CreateApplicationPort");
		definition.setTargetNamespace("http://hasee.com/soap-demo");
		return definition;
	}
}
