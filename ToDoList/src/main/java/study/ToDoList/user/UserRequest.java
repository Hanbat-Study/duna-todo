package study.ToDoList.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
public class UserRequest {

    private String name;

    private Gender gender;

    private LocalDate birth;

    private Hometown hometown;


    private String login_id;

    private String password;

    User to() {
        return new User(name, gender, birth, hometown, login_id, password);
    }
}
