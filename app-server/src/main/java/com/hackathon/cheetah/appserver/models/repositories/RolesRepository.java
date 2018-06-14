package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<Roles, Long> {
}
