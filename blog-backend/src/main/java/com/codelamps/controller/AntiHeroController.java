package com.codelamps.controller;

import com.codelamps.dto.AntiHeroDTO;
import com.codelamps.model.AntiHero;
import com.codelamps.service.AntiHeroService;
import com.codelamps.util.AntiHeroUtil;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 12.07
 * description: springboot-angular-project-1
 */

@RestController
@RequestMapping("api/v1/anti-heroes")
@RequiredArgsConstructor
public class AntiHeroController {

    // inject service
    private final AntiHeroService service;

    // inject model mapper
    private final ModelMapper mapper;

    // mendapatkan semua list anti hero
    @GetMapping
    public List<AntiHeroDTO> getAntiHeroes(){
        List<AntiHero> antiHeroList = StreamSupport
                .stream(service.findAllAntiHeroes().spliterator(), false).collect(Collectors.toList());

        return antiHeroList.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    // mendapatkan anti hero berdasarkan id, dan langsung dirubah ke dto
    @GetMapping("/{id}")
    public AntiHeroDTO getAntiHeroById(@PathVariable("id") UUID id){
        return convertToDTO(service.findAntiHeroById(id));
    }

    // menambahkan anti hero
    @PostMapping
    public AntiHeroDTO postAntiHero(@RequestBody @Valid AntiHeroDTO antiHeroDTO){
        var entity = convertToEntity(antiHeroDTO);
        var antiHero = service.addAntiHero(entity);
        return convertToDTO(antiHero);
    }

    // update anti hero
    @PutMapping("/{id}")
    public void updateAntiHero(@PathVariable("id") UUID id, @RequestBody @Valid AntiHeroDTO antiHeroDTO){
        if (!id.equals(antiHeroDTO.getId())) throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "id does not match"
        );

        var antiHeroEntity = convertToEntity(antiHeroDTO);
        service.updateAntiHero(id, antiHeroEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteAntiHero(@PathVariable("id") UUID id){
        service.removeAntiHeroById(id);
    }

    // merubah entity menjadi dto
    public AntiHeroDTO convertToDTO(AntiHero antiHeroEntity){
        return mapper.map(antiHeroEntity, AntiHeroDTO.class);
    }

    // merubah dto menjadi entity
    public AntiHero convertToEntity(AntiHeroDTO antiHeroDTO){
        return mapper.map(antiHeroDTO, AntiHero.class);
    }

}
