package com.formation.movieappback.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String overview;

    private boolean adult;
    private String backdropPath;
    private String posterPath;
    private double voteAverage;
    private LocalDate releaseDate;
    private boolean video;

    @ManyToMany
    private List<GenreEntity> genres;
}

