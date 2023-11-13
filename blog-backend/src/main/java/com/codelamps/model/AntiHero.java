package com.codelamps.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 11.20
 * description: springboot-angular-project-1
 */

@Entity
@Table(name = "anti_hero")
@Data
@AllArgsConstructor
public class AntiHero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "first_name")
//    @NotNull(message = "First Name is required")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String house;
    private String knownAs;
    private String createdAt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss z").format(new Date());

}

