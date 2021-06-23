package hello.hellospring.domain;

import javax.persistence.*;

@Entity // jpa가 관리하는 엔터티
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //데이터 구분을 위한 시스템 id

//    @Column(name = "username")//DB와 매핑시 사용된다.
    private String name;

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
