package com.codelamps.service;

import com.codelamps.AntiHeroRepository;
import com.codelamps.exception.NotFoundException;
import com.codelamps.model.AntiHero;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
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

    // find All AntiHeroes
    public Iterable<AntiHero> findAllAntiHeroes() {
        return repository.findAll();
    }

    // find hero by id
    public AntiHero findAntiHeroById(UUID id) {
        return findOrThrow(id);
    }

    // delete anti hero by id
    public void removeAntiHeroById(UUID id) {
        findOrThrow(id);
    }

    // menambahakan anti hero
    public AntiHero addAntiHero(AntiHero antiHero) {
        return repository.save(antiHero);
    }

    // update anti hero
    public void updateAntiHero(UUID id, AntiHero antiHero) {
        findOrThrow(id);
        repository.save(antiHero);
    }

    private AntiHero findOrThrow(final UUID id) {
        return repository
                .findById(id)
                .orElseThrow(
                        () -> new NotFoundException("Anti Hero by id " + id + " was not found")
                );
    }
}
