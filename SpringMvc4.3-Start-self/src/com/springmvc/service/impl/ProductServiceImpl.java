package com.springmvc.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.springmvc.domain.Product;
import com.springmvc.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	private Map<Long, Product> products=new HashMap<Long,Product>();//数据库的数据保存与获取
	private AtomicLong generator = new AtomicLong();
	private List<Product> pList=new ArrayList<Product>();
	
	public ProductServiceImpl(){
		Product product =new Product();
		product.setName("MiBook");
		product.setDescription("MiBook write code is very good!");
		product.setPrice(4999.0d);
		product.setColor("white");
		product.setNumber(1);
		add(product);
	}
	@Override
	public Product add(Product product){
		long newid=generator.incrementAndGet();
		product.setId(newid);
		
		//保存到MAP中，模拟数据保存到数据库
		products.put(newid, product);
		pList.add(product);
		return product;
	}
	@Override
	public Product get(long id) {
		return products.get(id);
	}
	@Override
	public List<Product> show() {
		
		return pList;
	}
	@Override
	public List<Product> modify(long id,Product product) {
		int Id=(int)id-1;
		pList.remove(pList.get(Id));
		pList.add(Id, product);
		return pList;
	}
	@Override
	public List<Product> delete(long id) {
		int Id=(int)id-1;
		pList.remove(pList.get(Id));
		return pList;
	}
	
}
