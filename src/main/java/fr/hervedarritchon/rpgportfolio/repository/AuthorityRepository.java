package fr.hervedarritchon.rpgportfolio.repository;

import fr.hervedarritchon.rpgportfolio.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
