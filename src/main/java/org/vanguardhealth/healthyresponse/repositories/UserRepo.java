package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.User;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Long> {

    Optional<User> findByUserName(String userName);
}
