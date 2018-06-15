package com.msamsonov.homeinfoservice.persistance.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperature {
    @Id
    @GeneratedValue
    private Long id;

    private Double value;
}
