package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Activity;

import java.util.Optional;

public interface ActivityRepo extends CrudRepository<Activity, String> {
    Optional<Activity> findByActivity(String step1Question1);
}
