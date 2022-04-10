package com.lizgunther.videouniverseapp.repository;

import com.lizgunther.videouniverseapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
}
