package com.example.demo.Implementation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.AdminDto;
import com.example.demo.Repo.AdminRepo;
import com.example.demo.Service.AdminService;
import com.example.demo.model.AdminModel;

import lombok.Builder;

@Service
@Builder
public class AdminImpl implements AdminService {

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public AdminModel save(AdminDto dto) {
		AdminModel save = AdminModel.builder().aname(dto.getAname()).aaddress(dto.getAaddress())
				.build();
		return adminRepo.save(save);
	}

	@Override
	public List<AdminModel> findAll() {
		List<AdminModel> get = adminRepo.findAll();
		return get;
	}

	@Override
	public AdminModel update(AdminDto dto) {
		AdminModel update = AdminModel.builder().aname(dto.getAname()).aaddress(dto.getAaddress())
				.build();
		return adminRepo.save(update);
	}

	@Override
	@Transactional
	public String deleteByaid(int aid) {
		adminRepo.deleteByaid(aid);
		return "success";
	}

}
