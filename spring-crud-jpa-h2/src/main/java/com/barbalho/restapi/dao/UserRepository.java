package com.barbalho.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbalho.restapi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
