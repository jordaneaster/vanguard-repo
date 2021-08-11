package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Response;
import org.vanguardhealth.healthyresponse.models.ResponseMaps;

import java.util.Optional;

public interface ResponseMapRepo extends CrudRepository<ResponseMaps,Long> {
    Optional<ResponseMaps> findByResponse(Response response);
}
