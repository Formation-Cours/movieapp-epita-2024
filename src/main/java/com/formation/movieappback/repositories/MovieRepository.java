package com.formation.movieappback.repositories;

import com.formation.movieappback.entities.MovieEntity;
import com.formation.movieappback.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}
