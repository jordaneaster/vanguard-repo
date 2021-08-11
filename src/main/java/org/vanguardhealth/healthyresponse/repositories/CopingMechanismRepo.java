package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.CopingMechanism;

public interface CopingMechanismRepo extends CrudRepository<CopingMechanism,Long> {
    CopingMechanism findByTitle(String copingMechanism);
}
