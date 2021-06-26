package com.example.oauth2_example.service;

import com.example.oauth2_example.entity.SpOAuth2User;
import com.example.oauth2_example.entity.SpUser;
import com.example.oauth2_example.repository.SpOAuth2UserRepository;
import com.example.oauth2_example.repository.SpUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpUserService {

    private final SpOAuth2UserRepository oAuth2UserRepository;
    private final SpUserRepository spUserRepository;

    public SpUser load(SpOAuth2User oAuth2User) {
        SpOAuth2User dbUser = oAuth2UserRepository.findById(oAuth2User.getOauth2UserId())
                .orElseGet(() -> {
                    SpUser user = SpUser.builder().build();

                    user.setEmail(oAuth2User.getEmail());
                    user.setName(oAuth2User.getName());
                    user.setEnabled(true);

                    SpUser newUser = spUserRepository.save(user);

                    addAuthority(newUser.getId(), "ROLE_USER");

                    oAuth2User.setUserId(newUser.getId());

                    return oAuth2UserRepository.save(oAuth2User);

                });

        return spUserRepository.findById(dbUser.getUserId()).get();
    }
}
