package com.company.testtask.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|serial")
@Table(name = "TESTTASK_METER")
@Entity(name = "testtask_Meter")
public class Meter extends StandardEntity {
    private static final long serialVersionUID = -4535857301761783218L;

    @NotNull
    @Column(name = "SERIAL", nullable = false, length = 100)
    protected String serial;

    @NotNull
    @Column(name = "READING", nullable = false, length = 100)
    protected String reading;

    @Column(name = "IS_USED")
    protected Boolean is_used = false;

    public Boolean getIs_used() {
        return is_used;
    }

    public void setIs_used(Boolean is_used) {
        this.is_used = is_used;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}