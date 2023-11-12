package com.codelamps;

import com.codelamps.model.AntiHero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 11.37
 * description: springboot-angular-project-1
 */
public interface AntiHeroRepository extends JpaRepository<AntiHero, UUID> {
}
