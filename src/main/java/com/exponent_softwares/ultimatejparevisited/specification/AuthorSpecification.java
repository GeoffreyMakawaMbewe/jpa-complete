package com.exponent_softwares.ultimatejparevisited.specification;

import com.exponent_softwares.ultimatejparevisited.entities.Authors;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class AuthorSpecification {

    public static Specification<Authors> hasAge(int age) {

        return (Root<Authors> root , CriteriaQuery<?> query , CriteriaBuilder builder) -> {

            if (age == 0) {
                return null;
            }
            return builder.greaterThanOrEqualTo(root.get("age"), age);
        };

    }
    public static Specification<Authors> firstNameLike(String  name) {

        return (Root<Authors> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {

            if ( name == null){
                return null;
            }
            return builder.like(root.get("firstName"), "%"+name+"%");
        };
    }
    public static Specification<Authors> emailLike(String  email) {

        return (Root<Authors> root, CriteriaQuery<?> query, CriteriaBuilder builder) -> {

            if ( email == null){
                return null;
            }
            return builder.like(root.get("email"), "%"+email+"%");
        };
    }

}
