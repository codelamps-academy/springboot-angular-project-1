package com.codelamps.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 11.35
 * description: springboot-angular-project-1
 */

@Data
public class AntiHeroDTO {

    private UUID id;

    @NotNull(message = "First Name is required")
    private String firstName;

    private String lastName;

    private String house;

    private String knownAs;
}
