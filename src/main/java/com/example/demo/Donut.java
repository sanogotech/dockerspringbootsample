package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data @NoArgsConstructor
public class Donut {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DonutToppings toppings;

    public String name;
    public Double costDollars;
    public Integer numberAvailable;

    Donut(String name, DonutToppings toppings, Double costDollars, Integer numberAvailable) {
        this.name = name;
        this.toppings = toppings;
        this.costDollars = costDollars;
        this.numberAvailable = numberAvailable;
    }
}