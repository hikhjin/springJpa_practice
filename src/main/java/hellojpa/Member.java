package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {
    @Id // pk 매핑
    private Long id;
    @Column(name = "name", nullable = false) // db와 객체 이름 다를 때 db 이름 따로 지정 가능 (컬럼명은 name이다)
    private String username;
    private Integer age;
    @Enumerated(EnumType.STRING) // ENUM 타입 , 꼭 STRING 타입 사용
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP) // 날짜 타입
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    private LocalDate test1; // Date 써서 매핑하지 말고 그냥 이거로 써라.
    private LocalDateTime test2;
    @Lob // BLOB (나머지), CLOB (문자)
    private String description;

    @Transient // 매핑 무시
    private int tmp;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
