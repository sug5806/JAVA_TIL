package com.example.oauth2_example.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "sp_user")
@Data
public class SpUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String email;

    private String name;

    private boolean enabled;
}
