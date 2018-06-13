package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface WaterpanRepository extends CrudRepository<User, Long> {
}
