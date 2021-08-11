package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Activity;

public interface ActivityRepo extends CrudRepository<Activity, Long> {
}
