package com.tom.backend_iprwc_webshop.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "productId")
    private int id;

    @Column(name = "productName", nullable = false)
    private String name;

    @Column(name = "productInfo")
    private String info;

    @Column(name = "productPrice", nullable = false)
    private double price;


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getInfo() {
        return this.info;
    }

    public double getPrice() {
        return this.price;
    }
}