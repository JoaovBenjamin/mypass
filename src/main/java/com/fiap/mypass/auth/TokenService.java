package com.fiap.mypass.auth;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Service
public class TokenService {
    public Token createToken(String name){
        Algorithm algorithm = Algorithm.HMAC256("assinatura");
        String token = JWT.create()
                                .withSubject(name)
                                .withIssuer("mypass")
                                .sign(algorithm);

        return new Token(token,"JWT");
    }
}
