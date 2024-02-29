package com.champion.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.champion.model.CartItem;
@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
