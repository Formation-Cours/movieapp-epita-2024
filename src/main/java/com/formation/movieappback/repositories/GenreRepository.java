package com.formation.movieappback.repositories;

import com.formation.movieappback.entities.GenreEntity;
import com.formation.movieappback.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
