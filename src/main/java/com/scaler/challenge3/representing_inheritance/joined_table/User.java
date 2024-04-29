package com.scaler.challenge3.representing_inheritance.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseModel
{
    private String name;
    private String email;
    private String password;
}
