package com.favoriteshop.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractModel {
    @Id
    long id;
}
