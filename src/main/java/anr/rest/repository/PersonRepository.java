package anr.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anr.rest.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

	Optional<Person> findByPID(Integer id);

}
