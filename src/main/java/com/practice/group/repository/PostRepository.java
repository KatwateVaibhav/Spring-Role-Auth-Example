package com.practice.group.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.group.entity.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
