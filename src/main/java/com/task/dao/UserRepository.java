package com.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.task.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("Select u from User u where u.EmailId =:EmailId")
	public User getUserByUserName(@Param("EmailId") String EmailId);

}
