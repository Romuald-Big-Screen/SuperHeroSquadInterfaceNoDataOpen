package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.model;



import javax.persistence.*;


/*@Entity*/
@Table(name = "formed")
public class Formed {

    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/

    @Column(name = "formedYear")
    private int formedYear;

}
