package it.cs.unicam.pawm.bbgroup.springAngularProject.repository;

import java.util.Optional;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
