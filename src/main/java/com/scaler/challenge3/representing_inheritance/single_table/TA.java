package com.scaler.challenge3.representing_inheritance.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "3")
public class TA extends User
{
    private String college;
    private double avgRating;
    private int numberOfQuestionsResolved;
}
