package com.scaler.challenge3.representing_inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_tas")
public class TA extends User
{
    private String college;
    private double avgRating;
    private int numberOfQuestionsResolved;
}
