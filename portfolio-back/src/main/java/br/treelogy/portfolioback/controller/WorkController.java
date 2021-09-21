package br.treelogy.portfolioback.controller;

import br.treelogy.portfolioback.model.Work;
import br.treelogy.portfolioback.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/works")
public class WorkController {

    @Autowired
    private WorkService workService;

    /* VERBO: GET */

    @GetMapping(value = "/{id}", produces = "application/json")
    @CachePut("cacheuser")
    public ResponseEntity<Work> GetById(@PathVariable(value = "id") Long id) throws Exception {

        Work work = workService.WorkById(id);

        return new ResponseEntity<Work>(work, HttpStatus.OK);
    }
    @GetMapping(value = "/", produces = "application/json")
    @CachePut("cacheuser")
    public ResponseEntity<Work> GetById() throws Exception {

        Iterable<Work> work = workService.WorkList();

        return new ResponseEntity(work, HttpStatus.OK);
    }

}