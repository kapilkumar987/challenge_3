package com.scaler.challenge3.representing_inheritance.table_per_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends BaseModel
{
    private String name;
    private String email;
    private String password;
}
