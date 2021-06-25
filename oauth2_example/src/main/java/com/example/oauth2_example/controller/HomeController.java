package com.example.oauth2_example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private OidcUserService oidcUserService;

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/greeting")
    public OAuth2User greeting(@AuthenticationPrincipal OAuth2User user) {
        return user;
    }
}
