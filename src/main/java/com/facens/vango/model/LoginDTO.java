package com.facens.vango.model;

public record LoginDTO(Long id, String email, String password, String userName) {

    public LoginDTO(Login login) {
        this(
                login.getId(),
                login.getEmail(),
                login.getPassword(),
                login.getUserName()
        );
    }

}
