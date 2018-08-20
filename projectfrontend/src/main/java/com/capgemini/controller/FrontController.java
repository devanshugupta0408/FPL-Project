package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.bean.Product;

import ch.qos.logback.classic.net.SyslogAppender;

@RestController
public class FrontController {

	@RequestMapping("/show")
	public ModelAndView getProduct() {
		RestTemplate rt = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Product> p = rt.getForObject("http://localhost:9898/products", ArrayList.class);
		return new ModelAndView("index", "Product", p);
	}

	@RequestMapping("/low")
	public ModelAndView getAsc() {
		RestTemplate rt = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Product> p = rt.getForObject("http://localhost:9898/LowtoHigh", ArrayList.class);
		return new ModelAndView("index", "Product", p);
	}

	@RequestMapping("/high")
	public ModelAndView getDesc() {
		RestTemplate rt = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Product> p = rt.getForObject("http://localhost:9898/HightoLow", ArrayList.class);
		return new ModelAndView("index", "Product", p);
	}

	@RequestMapping("/bestseller")
	public ModelAndView getBest() {
		RestTemplate rt = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Product> p = rt.getForObject("http://localhost:9898/BestSeller", ArrayList.class);
		return new ModelAndView("index", "Product", p);
	}

	@RequestMapping("/mostviewed")
	public ModelAndView getViewed() {
		RestTemplate rt = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Product> p = rt.getForObject("http://localhost:9898/MostViewed", ArrayList.class);
		return new ModelAndView("index", "Product", p);
	}

	@RequestMapping("/range")
	public ModelAndView getRange(@RequestParam int min, @RequestParam int max) {

		RestTemplate rt = new RestTemplate();
		@SuppressWarnings("unchecked")
		List<Product> p = rt.getForObject("http://localhost:9898/Range?min=" + min + "&max=" + max, ArrayList.class);
		return new ModelAndView("index", "Product", p);
	}
}