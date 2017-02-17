package com.springmvc.service;

import com.springmvc.domain.Product;

public interface ProductService {
	Product add(Product product);
	Product get(long id);
}
