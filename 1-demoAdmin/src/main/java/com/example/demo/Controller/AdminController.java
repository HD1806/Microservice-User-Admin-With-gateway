package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.AdminDto;
import com.example.demo.Service.AdminService;
import com.example.demo.Service.UserService;
import com.example.demo.model.AdminModel;
import com.example.demo.model.UserModel;

@RequestMapping("/admin")
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserService userService;

	@PostMapping(value = "/create", produces = "application/json")
	public AdminModel create(@RequestBody AdminDto dto) {
		AdminModel output = adminService.save(dto);
		return output;
	}

	@GetMapping(value = "getalladmin", produces = "application/json")
	public List<AdminModel> findAll() {
		List<AdminModel> output = adminService.findAll();
		return output;
	}
	
	@GetMapping(value = "getalluser",produces = "application/json")
	public List<UserModel> findAllUser(){
		List<UserModel> output=userService.findAll();
		return output;
	}

	@PutMapping(value = "update", produces = "application/json")
	public AdminModel update(@RequestBody AdminDto dto) {
		AdminModel output = adminService.update(dto);
		return output;
	}

	@DeleteMapping(value = "deleteadmin/{aid}", produces = "application/json")
	public String deleteByaid(@PathVariable int aid) {
		String output = adminService.deleteByaid(aid);
		return output;
	}
	
	@DeleteMapping(value="deleteuser/{sid}",produces = "application/json")
	public String deleteById(@PathVariable int sid) {
		String output=userService.deleteBysid(sid);
		return output;
	}

}
