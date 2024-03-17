package study.ToDoList.User;

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

    private enum gender;

    private LocalDate birth;

    private enum hometown;

    private String login_id;

    private String password;

    protected User() {}

    public User(String name, LocalDate birth, String login_id, String password) {
        this.name = name;
        this.birth = birth;
        this.login_id = login_id;
        this.password = password;
    }



}
