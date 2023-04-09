package com.adobe.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adobe.Model.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
