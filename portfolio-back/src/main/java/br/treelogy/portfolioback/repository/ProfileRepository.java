package br.treelogy.portfolioback.repository;

import br.treelogy.portfolioback.model.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {

@Query("SELECT u FROM Profile u WHERE u.id = ?1")
    Profile FindProfileById(Long id);
}
