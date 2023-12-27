package com.techconative.demo.repository;

import com.techconative.demo.bo.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
