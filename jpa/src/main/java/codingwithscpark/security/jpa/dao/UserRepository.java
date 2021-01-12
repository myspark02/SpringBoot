package codingwithscpark.security.jpa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import codingwithscpark.security.jpa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
   
    Optional<User> findByUsername(String username);
}
