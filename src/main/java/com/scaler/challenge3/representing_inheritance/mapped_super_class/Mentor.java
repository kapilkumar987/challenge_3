package com.scaler.challenge3.representing_inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_mentors")
public class Mentor extends User
{
    private String company;
    private double angRating;
}
