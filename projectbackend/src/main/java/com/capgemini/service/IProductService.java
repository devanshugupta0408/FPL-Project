package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Product;

public interface IProductService {

	public List<Product> showProducts();

	public List<Product> LowToHigh();

	public List<Product> HighToLow();

	public List<Product> BestSeller();

	public List<Product> MostViewed();

	public List<Product> Range(int min, int max);

}
