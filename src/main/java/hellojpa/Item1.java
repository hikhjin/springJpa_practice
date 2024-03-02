package hellojpa;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class Item1 {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int price;
}
