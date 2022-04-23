package org.jp.azure.spring.starter.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/azure/connect")
public class AzureRestController {

	@Autowired
	private Environment environment;

	@GetMapping
	public String processRequest() {
		return "Hello from ".concat(environment.getProperty("server.port"));
	}

}
