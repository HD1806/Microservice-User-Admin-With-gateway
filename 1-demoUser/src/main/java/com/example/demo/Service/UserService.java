package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.model.UserModel;

@Service
public interface UserService {

	UserModel save(UserDto dto);

	List<UserModel> findAll();

	UserModel update(UserDto dto);

	String deleteBysid(int sid);

}
