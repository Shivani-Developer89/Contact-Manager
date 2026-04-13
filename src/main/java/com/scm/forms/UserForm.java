package com.scm.forms;

import com.scm.entities.Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Lombok
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserForm {
    private String name;
    private String  email;
    private String password;
    private String about;
    private String mobileNo;

}
