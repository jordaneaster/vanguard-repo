package org.vanguardhealth.healthyresponse.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vanguardhealth.healthyresponse.models.Mood;

public interface MoodRepo extends CrudRepository<Mood,Long> {
    Mood findByMood(String mood);
}
