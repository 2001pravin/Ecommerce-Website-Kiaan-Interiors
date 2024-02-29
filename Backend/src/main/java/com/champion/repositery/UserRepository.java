package com.champion.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.champion.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
     
	
	public User findByEmail(String email);

	
}
