package com.example.demo.Implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.UserDto;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;
import com.example.demo.model.UserModel;

import lombok.Builder;

@Service
@Builder
public class UserImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserModel save(UserDto dto) {
		UserModel save = UserModel.builder().sid(dto.getSid()).sname(dto.getSname()).saddress(dto.getSaddress())
				.build();
		return userRepo.save(save);
	}

	@Override
	public List<UserModel> findAll() {
		List<UserModel> get = userRepo.findAll();
		return get;
	}

	@Override
	public UserModel update(UserDto dto) {
		UserModel update = UserModel.builder().sid(dto.getSid()).sname(dto.getSname()).saddress(dto.getSaddress())
				.build();
		return userRepo.save(update);
	}

	@Override
	@Transactional
	public String deleteBysid(int sid) {
		userRepo.deleteBysid(sid);
		return "success";
	}

}
