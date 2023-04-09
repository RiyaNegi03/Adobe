package com.adobe.Repo;
import com.adobe.Model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
