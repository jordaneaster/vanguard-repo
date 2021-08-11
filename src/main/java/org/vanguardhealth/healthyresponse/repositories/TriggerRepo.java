package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Trigger;

public interface TriggerRepo extends CrudRepository<Trigger,Long> {
    Trigger findByName(String trigger);
}
