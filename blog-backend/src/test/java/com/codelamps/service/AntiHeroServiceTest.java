package com.codelamps.service;

import com.codelamps.AntiHeroRepository;
import com.codelamps.model.AntiHero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 13/11/23
 * Time: 06.59
 * description: springboot-angular-project-1
 */

@ExtendWith(MockitoExtension.class)
class AntiHeroServiceTest {

    @Mock
    private AntiHeroRepository repository;

    @InjectMocks
    private AntiHeroService service;


    private AntiHero antiHeroList;

    @BeforeEach
    void setUp() {
        UUID id = UUID.randomUUID();
        antiHeroList = new AntiHero(id, "a", "a", "a", "s", new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z").format(new Date()));
    }

    @Test
    void findAllAntiHeroes() {
        List<AntiHero> list = new ArrayList<>();
        list.add(antiHeroList);

        Mockito.doReturn(Collections.singleton(antiHeroList)).when(repository).findAll();

        Iterable<AntiHero> allList = service.findAllAntiHeroes();

        assertTrue(allList.iterator().hasNext());
        assertEquals(list, service.findAllAntiHeroes());
        assertEquals(list, allList);
    }

    @Test
    void findAntiHeroById() {
    }

    @Test
    void removeAntiHeroById() {
    }

    @Test
    void addAntiHero() {
    }

    @Test
    void updateAntiHero() {
    }
}