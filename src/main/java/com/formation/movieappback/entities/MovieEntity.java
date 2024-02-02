package com.formation.movieappback.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty(value = "backdrop_path")
    private String backdropPath;

    @JsonProperty(value = "poster_path")
    private String posterPath;
    
    @JsonProperty(value = "vote_average")
    private double voteAverage;

    @JsonProperty(value = "release_date")
    private LocalDate releaseDate;
    private boolean video;

    @ManyToMany
    private List<GenreEntity> genres;
}

