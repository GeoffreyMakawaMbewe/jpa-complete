package com.exponent_softwares.ultimatejparevisited.repositories;

import com.exponent_softwares.ultimatejparevisited.entities.Authors;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorsRepository extends JpaRepository<Authors, Long> , JpaSpecificationExecutor<Authors> {

    List<Authors> findAllByFirstNameIgnoreCase(String firstName);
    List<Authors> findAllByFirstNameContainingIgnoreCase(String firstName);
    List<Authors> findAllByFirstNameStartsWithIgnoreCase(String firstName);
    List<Authors> findAllByFirstNameEndsWithIgnoreCase(String firstName);
    List<Authors> findAllByFirstNameIn(List<String> firstNames);

    @Transactional
    @Modifying
    @Query("""
    
    update Authors a set a.age = :age where a.id = :id
    
    """)
    int updateAuthors(int age, int id);

    @Modifying
    @Transactional
    @Query("""
        update Authors a set a.age = :age
    
    """)
    void updateAllAuthors(int age);

    List<Authors> findByNamedQuery(@Param("age") int age);
}