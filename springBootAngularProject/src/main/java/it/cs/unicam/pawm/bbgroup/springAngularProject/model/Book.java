package it.cs.unicam.pawm.bbgroup.springAngularProject.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer bookId;

    private String name;
    private String author;
    private String publisher;
    private int pages;
    private int year;
    private String isbn;
    private String description;
    private double price;
    private String urlImage;
    private boolean isAvailable;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return getBookId() != null && Objects.equals(getBookId(), book.getBookId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}