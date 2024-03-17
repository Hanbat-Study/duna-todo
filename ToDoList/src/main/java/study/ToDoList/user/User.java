package study.ToDoList.user;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@jakarta.persistence.Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long userId;

    private String name;

    private Gender gender;

    private LocalDate birth;

    private Hometown hometown;

    private String loginId;

    private String password;

    public User() {
    }

    public User(String name, Gender gender, LocalDate birth, Hometown hometown, String loginId, String password) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.loginId = loginId;
        this.password = password;
    }
}
