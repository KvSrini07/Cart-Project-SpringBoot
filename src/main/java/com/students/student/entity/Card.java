package com.students.student.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
//@Table(name = "posts")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerAdd")
    private String customerAddress;

    public Card(String title, String description) {
        super();
        this.customerName = title;
        this.customerAddress = description;
    }

    @JsonIgnoreProperties(value = "card")
    @OneToMany(mappedBy ="card")
//    @JoinColumn(name = "pc_fid", referencedColumnName = "id")
    private List<Item> items = new ArrayList<>();

    public Card() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
