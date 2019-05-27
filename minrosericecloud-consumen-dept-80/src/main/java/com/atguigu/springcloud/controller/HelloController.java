package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	private static final String REST_URL="http://localhost:8001";
	@Autowired
	 private RestTemplate restTemplate;
	
	@RequestMapping(value="/consumer/hello")
	public String getHello(){
		 return restTemplate.getForObject(REST_URL+"/hello", String.class,String.class);
	 }
	@RequestMapping(value="/consumer/service")
	public Object getService(){
		 return restTemplate.getForObject(REST_URL+"/service", Object.class,String.class);
		 
	}
}
