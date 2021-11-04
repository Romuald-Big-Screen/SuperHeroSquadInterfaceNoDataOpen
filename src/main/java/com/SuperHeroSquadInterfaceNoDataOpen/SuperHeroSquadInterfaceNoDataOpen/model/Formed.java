package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.model;

import lombok.Data;

import javax.persistence.*;

@Data
/*@Entity*/
@Table(name = "formed")
public class Formed {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "formed")
    private int formedYear;

}
