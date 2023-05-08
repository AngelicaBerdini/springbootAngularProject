package it.cs.unicam.pawm.bbgroup.springAngularProject.repository;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.user.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepository extends JpaRepository<Costumer, Integer> {
}