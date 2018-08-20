package com.capgemini.dao;

import java.util.List;

import com.capgemini.bean.Product;

public interface IProductDao {

	public List<Product> showProducts();

	public List<Product> LowToHigh();

	public List<Product> HighToLow();

	public List<Product> BestSeller();

	public List<Product> MostViewed();

	public List<Product> Range(int min, int max);
}
