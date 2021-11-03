package com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.repository;

import com.SuperHeroSquadInterfaceNoDataOpen.SuperHeroSquadInterfaceNoDataOpen.model.Formed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormedRepositorie extends CrudRepository<Formed, Long> {
}
