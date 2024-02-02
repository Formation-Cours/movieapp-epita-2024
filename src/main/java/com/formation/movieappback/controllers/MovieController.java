package com.formation.movieappback.controllers;

import com.formation.movieappback.entities.MovieEntity;
import com.formation.movieappback.repositories.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("")
    public Iterable<MovieEntity> findAll() {
        return this.movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<MovieEntity> findById(@PathVariable Long id) {
        return this.movieRepository.findById(id);
    }
}
