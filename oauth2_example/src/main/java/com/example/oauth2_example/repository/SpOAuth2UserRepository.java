package com.example.oauth2_example.repository;

import com.example.oauth2_example.entity.SpOAuth2User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpOAuth2UserRepository extends JpaRepository<SpOAuth2User, String> {
}
