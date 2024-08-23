package com.fiap.mypass.auth;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fiap.mypass.user.UserRespository;

@Service
public class AuthService {
    final UserRespository respository;
    final PasswordEncoder passwordEncoder;
    final TokenService tokenService;
   
    public AuthService(UserRespository respository, PasswordEncoder passwordEncoder, TokenService tokenService) {
        this.respository = respository;
        this.passwordEncoder = passwordEncoder;
        this.tokenService = tokenService;
    }

    public Token login(Credentials credentials){
        var user = respository.findByName(credentials.name())
                        .orElseThrow(() -> new RuntimeException("Acesso negado"));

        if(!passwordEncoder.matches(credentials.password(), user.getPassword()))
            throw new RuntimeException("Acesso negado");

            return tokenService.createToken(credentials.name());
    }

    
}
