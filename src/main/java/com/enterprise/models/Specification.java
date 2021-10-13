package com.enterprise.models;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table
public class Specification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String materialName;
    private double materialCount;
}
