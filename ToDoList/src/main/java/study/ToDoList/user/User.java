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
    private int userid;

    private String name;

    private Gender gender;

    private LocalDate birth;

    private Hometown hometown;

    private String login_id;

    private String password;

    protected User() {}

    public User(String name, Gender gender, LocalDate birth, Hometown hometown, String login_id, String password) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.login_id = login_id;
        this.password = password;
    }
}
