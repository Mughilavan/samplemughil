package com.techconative.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techconative.demo.bo.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
