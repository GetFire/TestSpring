package com.favoriteshop.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends AbstractModel {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Embedded
    private Contact contact;

    @Enumerated(EnumType.STRING)
    private Role role;
}
