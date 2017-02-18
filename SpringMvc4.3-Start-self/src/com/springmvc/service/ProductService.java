package com.springmvc.service;

import java.util.List;

import com.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);
	List<Product> show();
	List<Product> modify(long id,Product product);
	List<Product> delete(long id);
}
