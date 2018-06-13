package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.Credentials;
import com.hackathon.cheetah.appserver.models.entities.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
