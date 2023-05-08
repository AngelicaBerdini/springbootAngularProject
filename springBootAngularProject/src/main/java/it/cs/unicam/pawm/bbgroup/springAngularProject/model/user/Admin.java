package it.cs.unicam.pawm.bbgroup.springAngularProject.model.user;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Admin extends User {

    private Role role= Role.ADMIN;

}