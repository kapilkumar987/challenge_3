package com.scaler.challenge3.representing_inheritance.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User
{
    private String college;
    private double avgRating;
    private int numberOfQuestionsResolved;
}
