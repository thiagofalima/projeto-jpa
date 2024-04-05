package com.projetojpa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
