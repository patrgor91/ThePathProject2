package com.example.thepathproject2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PasswordDto {

    private String actualPassword;

    private String newPassword;

    private String newRepeatedPassword;

}
