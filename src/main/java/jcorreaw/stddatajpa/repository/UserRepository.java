package jcorreaw.stdDataJpa.repository;

import jcorreaw.stdDataJpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
