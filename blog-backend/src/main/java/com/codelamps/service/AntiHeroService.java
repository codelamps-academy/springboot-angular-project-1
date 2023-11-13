package com.codelamps.service;

import com.codelamps.AntiHeroRepository;
import com.codelamps.exception.NotFoundException;
import com.codelamps.model.AntiHero;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 11.38
 * description: springboot-angular-project-1
 */

@Service
@RequiredArgsConstructor
public class AntiHeroService {

    private final AntiHeroRepository repository;

    // logging
    Logger log = LoggerFactory.getLogger(AntiHeroService.class);

    // find All AntiHeroes
    public Iterable<AntiHero> findAllAntiHeroes() {
        log.info("Find All Anti Heroes");
        return repository.findAll();
    }

    // find hero by id
    public AntiHero findAntiHeroById(UUID id) {
        log.info("Find Anti Hero By Id");
        return findOrThrow(id);
    }

    // delete anti hero by id
    public void removeAntiHeroById(UUID id) {
        log.info("Delete Anti Hero By Id");
        findOrThrow(id);
    }

    // menambahakan anti hero
    public AntiHero addAntiHero(AntiHero antiHero) {
        log.info("Add Anti Hero");
        return repository.save(antiHero);
    }

    // update anti hero
    public void updateAntiHero(UUID id, AntiHero antiHero) {
        log.info("Update Anti Hero By Id");
        findOrThrow(id);
        repository.save(antiHero);
    }

    private AntiHero findOrThrow(final UUID id) {
        log.info("Find Or Throw By Id");
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new NotFoundException("Anti Hero by id " + id + " was not found")
                );
    }
}
