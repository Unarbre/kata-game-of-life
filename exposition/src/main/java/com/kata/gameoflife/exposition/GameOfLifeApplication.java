package com.kata.gameoflife.exposition;

import io.jkratz.mediator.core.Mediator;
import io.jkratz.mediator.core.Registry;
import io.jkratz.mediator.spring.SpringMediator;
import io.jkratz.mediator.spring.SpringRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.kata.gameoflife.exposition, com.kata.gameoflife.application"})
public class GameOfLifeApplication {

    private final ApplicationContext applicationContext;

    public GameOfLifeApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public Registry registry() {
        return new SpringRegistry(applicationContext);
    }

    @Bean
    public Mediator mediator(Registry registry) {
        return new SpringMediator(registry);
    }

    public static void main(String[] args) {
        SpringApplication.run(GameOfLifeApplication.class, args);
    }

}
