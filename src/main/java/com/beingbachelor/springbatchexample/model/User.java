package com.beingbachelor.springbatchexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "BatchUser")
public class User {

    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;
}
