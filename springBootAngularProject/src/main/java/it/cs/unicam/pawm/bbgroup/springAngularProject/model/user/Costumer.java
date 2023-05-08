package it.cs.unicam.pawm.bbgroup.springAngularProject.model.user;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Cart;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Costumer extends User {

    private Role role = Role.COSTUMER;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "cart_id")
    private Cart cart;

}