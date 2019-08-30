package com.company.testtask.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "TESTTASK_CONSUMER")
@Entity(name = "testtask_Consumer")
public class Consumer extends StandardEntity {
    private static final long serialVersionUID = -7740893102721390131L;

    @NotNull
    @Column(name = "ADRESS", nullable = false, length = 100)
    protected String adress;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "METER_ID")
    protected Meter meter;

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}