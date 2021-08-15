package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.IntakeProfile;

import java.util.Optional;

public interface IntakeProfileRepository extends CrudRepository<IntakeProfile,Long> {

    Optional<IntakeProfile> findByLastName(String lastName);
}
