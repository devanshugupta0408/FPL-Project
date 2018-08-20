package com.capgemini.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Product;
import com.capgemini.dao.ProductDao;

@Service
@Transactional
public class ProductService implements IProductService {

	@Autowired
	ProductDao repo;
	@Override
	public List<Product> showProducts() {
		
		return repo.showProducts();
	}
	@Override
	public List<Product> LowToHigh() {
		// TODO Auto-generated method stub
		return repo.LowToHigh();
	}
	@Override
	public List<Product> HighToLow() {
		// TODO Auto-generated method stub
		return repo.HighToLow();
	}

	public List<Product> BestSeller(){
		return repo.BestSeller();
	}
	public List<Product> MostViewed()
	{
		return repo.MostViewed();
	}
	public List<Product> Range(int min, int max)
	{
		return repo.Range(min, max);
	}
}
