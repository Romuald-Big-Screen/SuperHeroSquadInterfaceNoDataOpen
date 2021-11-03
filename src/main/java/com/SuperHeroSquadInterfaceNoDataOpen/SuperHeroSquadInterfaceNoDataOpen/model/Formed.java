package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "formed")
public class Formed {

    @Column(name="formed")
    private Long formedYear;

}
