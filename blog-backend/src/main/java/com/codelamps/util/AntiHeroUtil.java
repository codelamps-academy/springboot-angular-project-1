package com.codelamps.util;

import com.codelamps.dto.AntiHeroDTO;
import com.codelamps.model.AntiHero;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 12.11
 * description: springboot-angular-project-1
 */

@RequiredArgsConstructor
public class AntiHeroUtil {

    private final ModelMapper mapper;

    // merubah entity menjadi dto
    public AntiHeroDTO convertToDTO(AntiHero antiHeroEntity){
        return mapper.map(antiHeroEntity, AntiHeroDTO.class);
    }

    // merubah dto menjadi entity
    public AntiHero convertToEntity(AntiHeroDTO antiHeroDTO){
        return mapper.map(antiHeroDTO, AntiHero.class);
    }
}
