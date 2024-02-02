package com.formation.movieappback;

import com.formation.movieappback.entities.GenreEntity;
import com.formation.movieappback.entities.MovieEntity;
import com.formation.movieappback.repositories.GenreRepository;
import com.formation.movieappback.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MovieappBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieappBackApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(MovieRepository movieRepository, GenreRepository genreRepository) {
        return args -> {
            // Création et sauvegarde des genres si nécessaire
            GenreEntity actionGenre = new GenreEntity();
            actionGenre.setId(1L);
            actionGenre.setName("Action");
            genreRepository.save(actionGenre);

            GenreEntity scienceGenre = new GenreEntity();
            scienceGenre.setId(2L);
            scienceGenre.setName("Science Fiction");
            genreRepository.save(scienceGenre);

            GenreEntity dramaGenre = new GenreEntity();
            dramaGenre.setId(3L);
            dramaGenre.setName("Drame");
            genreRepository.save(dramaGenre);

            // Création des films
            MovieEntity aquaman = new MovieEntity();
            aquaman.setId(1L);
            aquaman.setTitle("Aquaman et le Royaume perdu");
            aquaman.setOverview("Alors qu'Arthur Curry affronte ses responsabilités de Roi des Sept Mers, un pouvoir antique enfoui depuis longtemps se déchaîne. Après avoir été témoin de l'effet de ces forces obscures, Aquaman doit forger une alliance difficile avec un vieil ennemi et se lancer dans un voyage périlleux pour protéger sa famille, son royaume et le monde d'une dévastation irréversible.");
            aquaman.setBackdropPath("/cnqwv5Uz3UW5f086IWbQKr3ksJr.jpg");
            aquaman.setPosterPath("/w8r7NAEIGLPH5r3NhiMobEO80PS.jpg");
            aquaman.setVoteAverage(6.991);
            aquaman.setReleaseDate(LocalDate.of(2023, 12, 20));
            aquaman.setVideo(false);
            aquaman.setGenres(List.of(actionGenre)); // Assigne les genres ici si nécessaire

            MovieEntity wonka = new MovieEntity();
            wonka.setId(2L);
            wonka.setTitle("Wonka");
            wonka.setOverview("Inspiré du personnage principal hors du commun de Charlie et la Chocolaterie, le best-seller de Roald Dahl qui est aujourd'hui l'un des livres pour enfants les plus vendus de tous les temps, \"Wonka\" est une histoire merveilleuse retraçant la jeunesse de Willy Wonka, et comment il est devenu ce grand inventeur, magicien et chocolatier que nous connaissons aujourd'hui.");
            wonka.setBackdropPath("/yyFc8Iclt2jxPmLztbP617xXllT.jpg");
            wonka.setPosterPath("/aKAnL3sr5iz5SsOs89vS2k1XrKO.jpg");
            wonka.setVoteAverage(7.232);
            wonka.setReleaseDate(LocalDate.of(2023, 12, 6));
            wonka.setVideo(false);
            wonka.setGenres(List.of(actionGenre)); // Assigne les genres ici si nécessaire

            MovieEntity wishAsha = new MovieEntity();
            wishAsha.setId(3L);
            wishAsha.setTitle("Wish, Asha et la bonne étoile");
            wishAsha.setOverview("Asha vit à Rosas, un royaume où tous les souhaits peuvent littéralement s'exaucer. Dans un moment de désespoir, elle adresse un vœu aux étoiles auquel va répondre une force cosmique : une petite boule d'énergie infinie prénommée Star. Avec son aide, Asha doit sauver son royaume d'un roi et prouver que lorsque le courage d'un humain se lie à la magie des étoiles, de merveilleuses choses peuvent arriver.");
            wishAsha.setBackdropPath("/ehumsuIBbgAe1hg343oszCLrAfI.jpg");
            wishAsha.setPosterPath("/ai0Nmib9SKw21xpocmHKiUANWb.jpg");
            wishAsha.setVoteAverage(6.668);
            wishAsha.setReleaseDate(LocalDate.of(2023, 11, 13));
            wishAsha.setVideo(false);
            wishAsha.setGenres(List.of(actionGenre, scienceGenre)); // Ajoute les genres ici si nécessaire

            MovieEntity migration = new MovieEntity();
            migration.setId(4L);
            migration.setTitle("Migration");
            migration.setOverview("La routine règne chez les Colvert. Si papa Mack préfère garder les siens bien à l’abri dans leur étang de la Nouvelle-Angleterre, maman Pam veut changer les choses et faire découvrir le monde à leurs deux enfants, Dax l’ado et Gwen la cadette. Après qu’une famille de canards migrateurs s’est enflammée pour des récits parlant d’endroits très lointains, Pam persuade Mack d’embarquer la famille dans un long périple, depuis la ville de New York jusque sous les tropiques, en Jamaïque.");
            migration.setBackdropPath("/meyhnvssZOPPjud4F1CjOb4snET.jpg");
            migration.setPosterPath("/z41CiKh09ljWXqHoGNb4zLom03K.jpg");
            migration.setVoteAverage(7.786);
            migration.setReleaseDate(LocalDate.of(2023, 12, 6));
            migration.setVideo(false);
            migration.setGenres(List.of(dramaGenre)); // Ajoute les genres ici si nécessaire

            MovieEntity theMarvels = new MovieEntity();
            theMarvels.setId(5L);
            theMarvels.setTitle("The Marvels");
            theMarvels.setOverview("Carol Danvers, alias Captain Marvel, a récupéré son identité auprès du tyrannique Kree et s'est vengée du renseignement suprême. Cependant, des conséquences inattendues la voient assumer le fardeau d'un univers déstabilisé. Lorsque ses fonctions l'envoient dans un trou de ver anormal lié à un révolutionnaire Kree, ses pouvoirs s'entremêlent avec deux autres superhéros pour former les Merveilles.");
            theMarvels.setBackdropPath("/tLxjbT5ROZRwYcpNT3nfQbqkApk.jpg");
            theMarvels.setPosterPath("/2XS0jH2F4SFiJG7txgWjgjwJ2L8.jpg");
            theMarvels.setVoteAverage(6.412);
            theMarvels.setReleaseDate(LocalDate.of(2023, 11, 8));
            theMarvels.setVideo(false);
            theMarvels.setGenres(List.of(actionGenre, scienceGenre)); // Ajoute les genres ici si nécessaire


            // Sauvegarde des films dans la base de données
            movieRepository.save(aquaman);
            movieRepository.save(wonka);
            movieRepository.save(wishAsha);
            movieRepository.save(migration);
            movieRepository.save(theMarvels);
        };
    }
}
