package com.exponent_softwares.ultimatejparevisited;

import com.exponent_softwares.ultimatejparevisited.entities.Authors;
import com.exponent_softwares.ultimatejparevisited.repositories.AuthorsRepository;
import com.exponent_softwares.ultimatejparevisited.specification.AuthorSpecification;
import com.github.javafaker.Faker;
import com.github.javafaker.Internet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;


@SpringBootApplication
public class UltimateJpaRevisitedApplication {

    public static void main(String[] args) {
        SpringApplication.run(UltimateJpaRevisitedApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(
        AuthorsRepository authorsRepository
            ){

       return args -> {

           for (int i = 0; i < 50; i++) {
               Faker faker = new Faker();
               Internet internet ;
               var author = Authors
                       .builder()
                       .firstName(faker.name().firstName())
                       .lastName(faker.name().lastName())
                       .age(faker.number().numberBetween(12, 50))
                       .email(faker.internet().emailAddress())
                       .password(faker.internet().password(8,30, true, true, true))
                       .build();
//               authorsRepository.save(author);
           }

           List<Authors> authorsList1 = authorsRepository.findAllByFirstNameContainingIgnoreCase("A");
//           System.out.println("authorsList = \n " + authorsList1);
           List<Authors> authorsList2 = authorsRepository.findAllByFirstNameEndsWithIgnoreCase("E");
//           System.out.println("authorsList2 = " + authorsList2);

//           authorsRepository.updateAuthors(70, 1);
//           authorsRepository.updateAllAuthors(0); DANGEROUS OPERATION !!!
//           var authorsList3 = authorsRepository.findByNamedQuery(30);
//           authorsList3.forEach(System.out::println);

           Specification<Authors> specification = Specification
                   .where(AuthorSpecification.hasAge(47))
//                   .and(AuthorSpecification.firstNameLike("Marco"));
//                   .or(AuthorSpecification.firstNameLike("j"));
                    .or(AuthorSpecification.emailLike("ya"));

           authorsRepository.findAll(specification).forEach(System.out::println);

       };
    }

}
