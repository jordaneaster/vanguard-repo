package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Mood;
import org.vanguardhealth.healthyresponse.models.ResponseMap;

import java.util.Optional;

public interface ResponseMapRepo extends CrudRepository<ResponseMap,Long> {
    Optional<ResponseMap> findByMood(Mood Mood);
}
