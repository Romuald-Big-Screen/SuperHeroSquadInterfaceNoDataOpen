package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.service;

import com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.model.Formed;
import com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.repository.FormedRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Optional;


@Service
public class FormedService {

    @Autowired
    private FormedRepositorie formedRepositorie;

   /* public Optional<Formed> getFormed(final Long id) {
        return formedRepositorie.findById(id);
    }*/

    public Iterable<Formed> getFormedYear() {
        return formedRepositorie.findAll();
    }

    public void deleteFormed(final Long id) {
        formedRepositorie.deleteById(id);
    }

    public Formed saveEmployee(Formed formed) {
        Formed savedFormed = formedRepositorie.save(formed);
        return savedFormed;
    }
}
