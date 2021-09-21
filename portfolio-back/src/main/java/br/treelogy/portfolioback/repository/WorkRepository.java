package br.treelogy.portfolioback.repository;

import br.treelogy.portfolioback.model.Work;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface  WorkRepository extends CrudRepository<Work, Long> {

    @Query("SELECT u FROM Work u WHERE u.id = ?1")
    Work FindWorkById(Long id);
}

