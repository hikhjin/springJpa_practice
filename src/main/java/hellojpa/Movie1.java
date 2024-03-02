package hellojpa;

import jakarta.persistence.Entity;

@Entity
public class Movie1 extends Item1 {
    private String director;
    private String actor;
}
