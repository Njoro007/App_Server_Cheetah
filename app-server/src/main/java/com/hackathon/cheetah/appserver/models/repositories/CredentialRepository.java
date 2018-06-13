package com.hackathon.cheetah.appserver.models.repositories;

import com.hackathon.cheetah.appserver.models.entities.Credentials;
import org.springframework.data.repository.CrudRepository;

public interface CredentialRepository extends CrudRepository<Credentials, Long> {
}
