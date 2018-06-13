package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.PanRefill;
import com.hackathon.cheetah.appserver.models.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanRefillRepository extends CrudRepository<PanRefill, Long> {
}
