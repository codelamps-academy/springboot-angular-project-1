package com.codelamps.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 12/11/23
 * Time: 12.02
 * description: springboot-angular-project-1
 */

@Configuration
public class AntiHeroConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        return new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean
    public RedisTemplate<UUID, Object> redisTemplate() {
        RedisTemplate<UUID, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setHashValueSerializer(new JdkSerializationRedisSerializer());
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        template.setEnableTransactionSupport(true);
        template.afterPropertiesSet();
        return template;
    }

//    @Bean
//    CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowCredentials(true);
//        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//        corsConfiguration.setAllowedHeaders(
//                Arrays.asList(
//                        "Origin",
//                        "Access-Control-Allow-Origin",
//                        "Content-Type",
//                        "Accept",
//                        "Authorization",
//                        "Origin, Accept",
//                        "X-Requested-With",
//                        "Access-Control-Request-Method",
//                        "Access-Control-Request-Headers"
//                )
//        );
//
//        corsConfiguration.setExposedHeaders(
//                Arrays.asList(
//                        "Origin",
//                        "Content-Type",
//                        "Accept",
//                        "Authorization",
//                        "Access-Control-Allow-Origin",
//                        "Access-Control-Allow-Credentials"
//                )
//        );
//        corsConfiguration.setAllowedMethods(
//                Arrays.asList(
//                        "GET", "POST", "PUT", "DELETE", "OPTIONS"
//                )
//        );
//
//        var urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//        urlBasedCorsConfigurationSource.registerCorsConfiguration(
//                "/**",
//                corsConfiguration
//        );
//
//        return new CorsFilter(
//                urlBasedCorsConfigurationSource);
//
//    }
}
