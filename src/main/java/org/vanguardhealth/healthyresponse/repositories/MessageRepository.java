package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Message;

import java.util.Optional;

public interface MessageRepository extends CrudRepository<Message,Long> {
    Optional<Message> findBySubject(String subject);
}
