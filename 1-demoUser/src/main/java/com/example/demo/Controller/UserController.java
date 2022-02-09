package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.UserDto;
import com.example.demo.Service.UserService;
import com.example.demo.model.UserModel;

@RequestMapping("user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "create", produces = "application/json")
	public UserModel save(@RequestBody UserDto dto) {
		UserModel output = userService.save(dto);
		return output;
	}

	@PutMapping(value = "update", produces = "application/json")
	public UserModel update(@RequestBody UserDto dto) {
		UserModel output = userService.update(dto);
		return output;
	}

}
