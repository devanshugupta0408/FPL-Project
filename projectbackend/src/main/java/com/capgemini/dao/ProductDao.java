package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.Product;

@Repository
public class ProductDao implements IProductDao {

	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Product> showProducts() {
		
			List<Product> list =new ArrayList<>();
			Query q=entityManager.createQuery("from Product");
			list =q.getResultList();
			return list;
	}
		
public List<Product> LowToHigh(){
	
	List<Product> list =new ArrayList<>();
	Query q=entityManager.createQuery("from Product ORDER BY price ASC");
	list =q.getResultList();
	return list;
}
	
	public List<Product> HighToLow(){
		List<Product> list =new ArrayList<>();
		Query q=entityManager.createQuery("from Product ORDER BY price DESC");
		list =q.getResultList();
		return list;
	}
	
	public List<Product> BestSeller(){
		
		List<Product> list =new ArrayList<>();
		Query q=entityManager.createQuery("from Product ORDER BY sold DESC");
		list =q.getResultList();
		return list;
	}
	
public List<Product> MostViewed(){
		
		List<Product> list =new ArrayList<>();
		Query q=entityManager.createQuery("from Product ORDER BY p_view DESC");
		list =q.getResultList();
		return list;
	}
	
public List<Product> Range(int min, int max){
	
	List<Product> list =new ArrayList<>();
	Query q=entityManager.createQuery("FROM Product WHERE price BETWEEN '"+min+"' AND '"+max+"'");
	list =q.getResultList();
	return list;
}
	
}
