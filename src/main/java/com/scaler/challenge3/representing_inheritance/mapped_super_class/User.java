package com.scaler.challenge3.representing_inheritance.mapped_super_class;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class User extends BaseModel
{
    private String name;
    private String email;
    private String password;
}
