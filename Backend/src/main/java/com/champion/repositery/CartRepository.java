package com.champion.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.champion.model.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
