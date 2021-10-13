package com.enterprise.models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   /* private MultipartFile drawing;*/


  /*  private Specification specification;*/

    public Project() {
    }
}
