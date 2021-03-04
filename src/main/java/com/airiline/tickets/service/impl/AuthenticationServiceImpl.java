package com.airiline.tickets.service.impl;

import com.airiline.tickets.configuration.security.JwtProvider;
import com.airiline.tickets.dto.auth.SignInResponse;
import com.airiline.tickets.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;

    @Override
    public SignInResponse authenticate(String username, String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String jwt = jwtProvider.generateToken(userDetails);

        return SignInResponse.builder()
                .token(jwt)
                .username(userDetails.getUsername())
                .authorities(userDetails.getAuthorities())
                .build();
    }
}
