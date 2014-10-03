package fr.hervedarritchon.rpgportfolio.repository;

import fr.hervedarritchon.rpgportfolio.domain.PersistentToken;
import fr.hervedarritchon.rpgportfolio.domain.User;
import org.joda.time.LocalDate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the PersistentToken entity.
 */
public interface PersistentTokenRepository extends MongoRepository<PersistentToken, String> {

    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);

}
