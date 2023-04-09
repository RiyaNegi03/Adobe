package com.adobe.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adobe.Model.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

    @Query("Select p from Post p")
    public List<Post> findTop5Likes();
}
