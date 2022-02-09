package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dto.AdminDto;
import com.example.demo.model.AdminModel;

@Service
public interface AdminService {

	AdminModel save(AdminDto dto);

	List<AdminModel> findAll();

	AdminModel update(AdminDto dto);

	String deleteByaid(int aid);

}
