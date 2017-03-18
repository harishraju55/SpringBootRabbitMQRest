package com.tek.rabbitmqrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tek.rabbitmqrest.model.EProduct;
import com.tek.rabbitmqrest.service.EProductService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value="/v1/app")
@Api(value="RabbitMQ2", description="This service is for crud operation for saving EProduct to DB")
public class EProductController {
	
	@Autowired
	EProductService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public void saveEProduct(@RequestBody EProduct eProduct) {
	
		service.saveProduct(eProduct);
		
	}

}
