package com.example.oauth2_example.repository;

import com.example.oauth2_example.entity.SpUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpUserRepository extends JpaRepository<SpUser, String> {
}
