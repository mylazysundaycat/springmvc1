package hello.servlet.domain.member;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String userName;
    private int age;

    public Member() {

    }
    public Member(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
