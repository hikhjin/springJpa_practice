package hellojpa;

import jakarta.persistence.Entity;

@Entity
public class Book1 extends Item1 {
    private String author;
    private String isbn;
}
