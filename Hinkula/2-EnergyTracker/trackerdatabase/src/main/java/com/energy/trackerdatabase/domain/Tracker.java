package com.energy.trackerdatabase.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tracker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    private int units, days;

    public Tracker(long id) {
        this.id = id;
    }
}
