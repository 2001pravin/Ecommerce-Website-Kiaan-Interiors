package com.champion.services;

import org.springframework.stereotype.Service;

import com.champion.Exception.UserException;
import com.champion.model.User;
@Service
public interface UserService {

	public User findUserByid(Long userid)throws UserException;
	public User findUserProfilByJwt(String jwt)throws UserException;
}
