package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.User;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Long> {
<<<<<<< HEAD
=======

>>>>>>> 42cc4d6d9be9782da10a19b8e2f9b0c7c0288ea2
    Optional<User> findByUserName(String userName);
}
