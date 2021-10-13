package com.enterprise.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Costing implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double price;
    private double check;



}
