package yju.wdb.datarest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import yju.wdb.datarest.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")  // check it later, not working.
public interface AlienRepository extends JpaRepository<Alien, Integer> {
    
}
