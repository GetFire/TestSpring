package com.favoriteshop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "goods")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends AbstractModel {
    @Column(name = "name")
    private String name;

    @Column(name = "manufacturers")
    private String manufacturer;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;
    @Column(name = "url_logo")
    private String url;
}
