package com.champion.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.champion.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
	@Query("SELECT p FROM Product p " +
		       "WHERE (p.category.name = :category OR :category = ' ') " +
		       "AND ((:minPrice IS NULL AND :maxPrice IS NULL) OR (p.discountedprice BETWEEN :minPrice AND :maxPrice)) " +
		       "AND (:minDiscount IS NULL OR p.discountedpersent >= :minDiscount) " +
		       "ORDER BY " +
		       "CASE WHEN :sort = 'price_low' THEN p.discountedprice END ASC, " +
		       "CASE WHEN :sort = 'price_high' THEN p.discountedprice END DESC")
	public List<Product>filterProducts(@Param("category")String category,
			@Param("maxPrice")String maxPrice,
			@Param("minPrice")String minPrice,
			@Param("minDiscount")String minDiscount,
			@Param("sort")String sort
			
			
			);

}
