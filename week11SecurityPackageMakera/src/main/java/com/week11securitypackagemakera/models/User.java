package com.week11securitypackagemakera.models;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(GeneratedValue)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
