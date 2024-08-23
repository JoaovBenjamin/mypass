package com.fiap.mypass.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRespository respository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> findAll(){
        return respository.findAll();
    }

    public User create(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return respository.save(user);
    }

}
