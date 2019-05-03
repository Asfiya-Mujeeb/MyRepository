package com.asfi.springBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Autowired
	CamelContext camelContext;

	@Override
	public void configure() throws Exception {
		
		from("file:input_folder?noop=true")
		.to("file:output_foler");
	}
	
	
	
	
	
}
