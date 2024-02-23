package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    public List<Member1> getMembers() {
        return members;
    }

    public void setMembers(List<Member1> members) {
        this.members = members;
    }

    @OneToMany(mappedBy = "team") // 가짜 매핑 (값 넣기x)
    private List<Member1> members = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
