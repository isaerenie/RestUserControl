package com.works.repositories;

import com.works.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByEmail(String email);

    List<User> findByNameContainsIgnoreCaseOrSurnameContainsIgnoreCase(String q, String q1);

    Optional<User> findByEmailEqualsAndPasswordEquals(String email, String newPass);
    // List
    // Select * from user -> bütün tablo bilgileri gelir. ls.size() -> count

    // count
    // select count from user -> sadece satır sayısı -> count

}
