package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
