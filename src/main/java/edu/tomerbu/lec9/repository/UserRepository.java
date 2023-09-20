package edu.tomerbu.lec9.repository;

import edu.tomerbu.lec9.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    //Derived query methods:

    //find user by email:
    Optional<User> findUserByEmailIgnoreCase(String email);
    Optional<User> findUserByUsernameIgnoreCase(String username);

}
