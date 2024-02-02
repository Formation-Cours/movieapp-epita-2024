package com.formation.movieappback.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "genre")
public class GenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
