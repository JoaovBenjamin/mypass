package com.fiap.mypass.dto;

import com.fiap.mypass.user.User;

public record UserResponse(
    Long id, 
    String name
) {
    public static UserResponse fromModel(User user){
        return new UserResponse(user.getId(), user.getName());
    }
}
