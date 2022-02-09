package com.example.demo.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

	@Transactional
	@Modifying
	@Query("delete from UserModel where sid=:sid")
	int deleteBysid(@Param("sid") int sid);

}
