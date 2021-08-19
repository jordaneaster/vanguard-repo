package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Badge;

import java.util.Optional;

public interface BadgeRepository extends CrudRepository<Badge,Long> {

    Optional<Badge> findByBadge(String badge);
}
