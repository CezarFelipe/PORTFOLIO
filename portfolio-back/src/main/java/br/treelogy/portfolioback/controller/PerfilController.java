package br.treelogy.portfolioback.controller;

import br.treelogy.portfolioback.model.Profile;
import br.treelogy.portfolioback.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/profile")
public class PerfilController {

    @Autowired
    private ProfileService profileService;

    @GetMapping(value = "/{id}", produces = "application/json")
    @CachePut("cacheuser")
    public ResponseEntity<Profile> GetProfileById(@PathVariable(value = "id") Long id) throws Exception {

        Profile profile = profileService.ProfileById(id);

        if (profile == null)
        {
            return new ResponseEntity<Profile>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Profile>(profile, HttpStatus.OK);
    }
}

