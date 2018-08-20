package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Product;
import com.capgemini.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService service;

	@RequestMapping(value = "/products")
	public List<Product> getProducts() {
		return service.showProducts();
	}

	@RequestMapping(value = "/LowtoHigh")
	public List<Product> getAsc() {
		return service.LowToHigh();
	}

	@RequestMapping(value = "/HightoLow")
	public List<Product> getDes() {
		return service.HighToLow();
	}

	@RequestMapping(value = "/BestSeller")
	public List<Product> getBest() {
		return service.BestSeller();
	}

	@RequestMapping(value = "/MostViewed")
	public List<Product> getView() {
		return service.MostViewed();
	}

	@RequestMapping(value = "/Range")
	public List<Product> getRange(/*@RequestParam */int min, /*@RequestParam*/ int max) {
		return service.Range(min, max);
	}
}