package com.champion.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.champion.Exception.ProductException;
import com.champion.model.Category;
import com.champion.model.Product;
import com.champion.repositery.CategoryRepository;
import com.champion.repositery.ProductRepository;
import com.champion.request.CreteProductRequest;
@Service
public class ProductServiceImp implements ProduactService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private CategoryRepository categoryRepository;
	

	@Override
	public Product createProduct(CreteProductRequest req) {
       Category topLevel=categoryRepository.findByName(req.getTopLevelCatrgory()) ;
       if (topLevel!=null) {
    	   Category topLevelCategory=new Category();
    	   topLevelCategory.setName(req.getTopLevelCatrgory());
    	   topLevelCategory.setLevel(1);
    	   
    	   topLevel=categoryRepository.save(topLevelCategory);
    	   
		
	}
       Category secondLevel=categoryRepository.findByNameAndParent(req.getTopLevelCatrgory(),topLevel.getName()) ;
       if (secondLevel!=null) {
    	   Category secondLevelCategory=new Category();
    	   secondLevelCategory.setName(req.getSecondLevelCatrgory());
    	   secondLevelCategory.setLevel(2);
    	   
    	   topLevel=categoryRepository.save(secondLevelCategory);
    	   
		
	}
       Category thirdLevel=categoryRepository.findByNameAndParent(req.getTopLevelCatrgory(),topLevel.getName()) ;
       if (thirdLevel!=null) {
    	   Category thirdLevelCategory=new Category();
    	   thirdLevelCategory.setName(req.getThirdLevelCatrgory());
    	   thirdLevelCategory.setLevel(3);
    	   
    	   topLevel=categoryRepository.save(thirdLevelCategory);
    	   
		
	}
       
       Product product=new Product();
       product.setTitle(req.getTitle());
       product.setColor(req.getColor());
       product.setDescription(req.getDescription());
       product.setDiscountedprice(req.getDiscountedPrice());
       product.setDiscountedpersent(req.getDiscountPersent());
       product.setImageUrl(req.getImageUrl());
       product.setBrand(req.getBrand());
       product.setPrice(req.getPrice());
       product.setSizes(req.getSize());
       product.setQuantity(req.getQuantity());
       product.setCategory(thirdLevel);
       product.setCreateAt(LocalDateTime.now());
      
		return productRepository.save(product);
	}

	@Override
	public String deleteProduct(Long productId) throws ProductException {
		Product product=FindProductById(productId);
		product.getSizes().clear();
		productRepository.delete(product);
		
		return "Product deleted Successfully";
	}

	@Override
	public Product updateProduct(Long productId, Product req) throws ProductException {
		Product product=FindProductById(productId);
		if (req.getQuantity()!=0) {
			product.setQuantity(req.getQuantity());
			
		}
		return productRepository.save(product);
		
	}

	@Override
	public Product FindProductById(Long id) throws ProductException {
		Optional<Product>optional=productRepository.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		throw new ProductException("Product Not Found With Id-"+id);
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		return null;
	}

	@Override
	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
		
		Pageable pageble=PageRequest.of(pageNumber, pageSize);
		
		List<Product> products=productRepository.filterProducts(category, stock, category, stock, sort);
		if (!colors.isEmpty()) {
			products=products.stream().filter(p->colors.stream().anyMatch(c->c.equalsIgnoreCase(p.getColor()))).collect(Collectors.toList());
		}
		if (stock!=null) {
			if (stock.equals("instock")) {
				products=products.stream().filter(p->p.getQuantity()>0).collect(Collectors.toList());
			}else if (stock.equals("out_of_stock")) {
				products=products.stream().filter(p->p.getQuantity()<1).collect(Collectors.toList());

			}
		}
		int startIndex=(int)pageble.getOffset();
		int endIndex=Math.min(startIndex+pageble.getPageSize(), products.size());
		List<Product>pageContent=products.subList(startIndex, endIndex);
		Page<Product>filteredProducts=new PageImpl<>(pageContent,pageble,products.size());
		
		return filteredProducts;
	}
	
     
}
