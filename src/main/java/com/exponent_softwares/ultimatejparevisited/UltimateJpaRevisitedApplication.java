package com.exponent_softwares.ultimatejparevisited;

import com.exponent_softwares.ultimatejparevisited.entities.Author;
import com.exponent_softwares.ultimatejparevisited.entities.subentities.Video;
import com.exponent_softwares.ultimatejparevisited.entities.subentities.VideoRepository;
import com.exponent_softwares.ultimatejparevisited.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class UltimateJpaRevisitedApplication {

    public static void main(String[] args) {
        SpringApplication.run(UltimateJpaRevisitedApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
            ){

       return args -> {


           Author author1 = Author
                   .builder()
                   .firstName("John")
                   .lastName("Banda")
                   .email("banda@gmail.com")
                   .age(20)
                   .build();
           Author author2 = Author
                   .builder()
                   .firstName("Bill")
                   .lastName("Banda")
                   .email("bbanda@gmail.com")
                   .age(21)
                   .build();
           Author author3 = Author
                   .builder()
                   .firstName("James")
                   .lastName("Banda")
                   .email("jbanda@gmail.com")
                   .age(24)
                   .build();
           Author author4 = Author
                   .builder()
                   .firstName("Martha")
                   .lastName("Banda")
                   .email("mbanda@gmail.com")
                   .age(22)
                   .build();
           Author author5 = Author
                   .builder()
                   .firstName("Osman")
                   .lastName("Banda")
                   .email("obanda@gmail.com")
                   .age(25)
                   .build();

           List<Author> authorList =  new ArrayList<>();
           authorList.add(author1);
           authorList.add(author2);
           authorList.add(author3);
           authorList.add(author4);
           authorList.add(author5);

           authorRepository.saveAll(authorList);

           Video video = Video
                   .builder()
                   .name("Test Video")
                   .length(212333)
                   .build();
        videoRepository.save(video);
       };
    }

}
