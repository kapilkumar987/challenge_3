package com.scaler.challenge3.representing_inheritance.single_table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType =  DiscriminatorType.INTEGER
)

@DiscriminatorValue(value = "0")
public class User extends BaseModel
{
    private String name;
    private String email;
    private String password;
}
