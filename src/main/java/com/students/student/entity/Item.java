package com.students.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
//@Table(name = "comments")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @JsonIgnoreProperties(value = "items")
    @ManyToOne
    @JoinColumn(name = "cartId")
    private Card card;

    public Item(String name) {
        super();
        this.name = name;
    }

    public Item() {

    }
}
