package it.cs.unicam.pawm.bbgroup.springAngularProject.repository;

import it.cs.unicam.pawm.bbgroup.springAngularProject.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    Optional<Cart> findByCartId(Integer cartId);
}