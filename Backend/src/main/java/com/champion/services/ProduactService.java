package com.champion.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.champion.Exception.ProductException;
import com.champion.model.Product;
import com.champion.request.CreteProductRequest;

public interface ProduactService {
	
	public Product createProduct(CreteProductRequest req);
	public String deleteProduct(Long productId)throws ProductException;
	public Product updateProduct(Long productId,Product  req)throws ProductException;
	public Product FindProductById(Long id)throws ProductException;
	public List<Product> findProductByCategory(String category);
	public Page<Product>getAllProduct(String category,List<String>colors,List<String>sizes,Integer minPrice,Integer maxPrice ,Integer minDiscount,String sort,String stock,Integer pageNumber,Integer pageSize);
	

}
