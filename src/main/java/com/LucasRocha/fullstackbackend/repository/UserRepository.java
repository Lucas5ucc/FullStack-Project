package com.LucasRocha.fullstackbackend.repository;

import com.LucasRocha.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
