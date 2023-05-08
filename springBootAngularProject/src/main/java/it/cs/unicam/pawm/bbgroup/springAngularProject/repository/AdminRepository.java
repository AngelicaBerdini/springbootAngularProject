package it.cs.unicam.pawm.bbgroup.springAngularProject.repository;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.user.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}