package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.WaterPan;
import org.springframework.data.repository.CrudRepository;

public interface WaterPanRepository extends CrudRepository<WaterPan, Long> {
    WaterPan getByLocation(String name);
}
