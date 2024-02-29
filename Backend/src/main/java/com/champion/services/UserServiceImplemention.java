package com.champion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.champion.Exception.ProductException;
import com.champion.Exception.UserException;
import com.champion.config.JwtProvider;
import com.champion.model.Product;
import com.champion.model.User;
import com.champion.repositery.UserRepository;
@Service
public class UserServiceImplemention implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private JwtProvider jwtProvider;

	@Override
	public User findUserByid(Long userid) throws UserException {
		Optional<User>optional=userRepository.findById(userid);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		throw new UserException("User Not Found With Id-"+userid);
	}

		

	@Override
	public User findUserProfilByJwt(String jwt) throws UserException {
   String email=jwtProvider.getEmailFromToken(jwt);
      User user=userRepository.findByEmail(email);
      if (user==null) {
    	  throw new UserException("User Not Found With Id-"+email);
		
	}
		return user;
	}

}
