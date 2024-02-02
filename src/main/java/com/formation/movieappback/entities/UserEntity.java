package com.formation.movieappback.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateur")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
}
