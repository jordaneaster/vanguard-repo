package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Reply;

import java.util.Optional;

public interface ReplyRepository extends CrudRepository<Reply,Long> {

    Optional<Reply> findByTitle(String title);
}
