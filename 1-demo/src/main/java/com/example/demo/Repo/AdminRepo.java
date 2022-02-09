package com.example.demo.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AdminModel;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Integer> {

	@Transactional
	@Modifying
	@Query("delete from AdminModel where aid=:aid")
	void deleteByaid(@Param("aid") int aid);

}
