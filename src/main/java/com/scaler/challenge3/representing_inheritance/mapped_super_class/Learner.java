package com.scaler.challenge3.representing_inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_learners")
public class Learner extends User
{
    private String college;
    private String company;
    private double psp;
}
