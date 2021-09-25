package br.treelogy.portfolioback.service;

import br.treelogy.portfolioback.model.Profile;
import br.treelogy.portfolioback.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile ProfileById(Long id) throws Exception {
        Profile profile = profileRepository.FindProfileById(id);

        return profile;
    }
}
