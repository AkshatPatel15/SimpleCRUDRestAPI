package br.com.exemplo.crud.rest.api.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}
