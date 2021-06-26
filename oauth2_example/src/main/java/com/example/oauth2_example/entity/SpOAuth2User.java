package com.example.oauth2_example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.oauth2.core.user.OAuth2User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "sp_oauth2_user")
public class SpOAuth2User {

    @Id
    private String oauth2UserId;

    private String userId;

    private String name;
    private String email;
    private LocalDateTime created;

    public enum Provider {
        google {
            public SpOAuth2User convert(OAuth2User userInfo) {
                return null;
            }
        },

        naver {
            public SpOAuth2User convert(OAuth2User userInfo) {
                return null;
            }
        };

        public abstract SpOAuth2User convert(OAuth2User userInfo);
    }
}
