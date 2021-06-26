package com.example.oauth2_example.config;

import com.example.oauth2_example.entity.SpOAuth2User;
import com.example.oauth2_example.entity.SpUser;
import com.example.oauth2_example.service.SpUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@RequiredArgsConstructor
public class SpOAuth2SuccessHandler implements AuthenticationSuccessHandler {

    private final SpUserService spUserService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        Object principal = authentication.getPrincipal();
        if (principal instanceof OidcUser) {
            // google
            SpOAuth2User oauth = SpOAuth2User.Provider.google.convert((OidcUser) principal);
            SpUser user = spUserService.load(oauth);

            SecurityContextHolder.getContext().setAuthentication(
                    new UsernamePasswordAuthenticationToken(user, "", user.getAuthoties())
            );

        } else if (principal instanceof OAuth2User) {
            // naver or kakao

            SpOAuth2User oauth = SpOAuth2User.Provider.naver.convert((OAuth2User) principal);
            SpUser user = spUserService.load(oauth);

            SecurityContextHolder.getContext().setAuthentication(
                    new UsernamePasswordAuthenticationToken(user, "", user.getAuthoties())
            );

        }

        request.getRequestDispatcher("/").forward(request, response);
    }
}
