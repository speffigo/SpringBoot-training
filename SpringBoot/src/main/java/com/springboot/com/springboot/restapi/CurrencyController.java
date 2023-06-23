package com.springboot.com.springboot.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

	@Autowired
	private CurrencyConfiguration currencyConfiguration;

	@RequestMapping("/Currency-Config")
	public CurrencyConfiguration info() {

		return currencyConfiguration;
	}
}
