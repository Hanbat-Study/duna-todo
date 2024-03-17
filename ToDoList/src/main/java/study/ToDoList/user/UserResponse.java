package study.ToDoList.user;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
public class UserResponse {

    private String name;

    private String gender;

    private LocalDate birth;

    private String hometown;

    private String login_id;

    private String password;


    private UserResponse(String name, String gender, LocalDate birth, String hometown, String login_id, String password) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.hometown = hometown;
        this.login_id = login_id;
        this.password = password;
    }

    static UserResponse from(User user) {
        return new UserResponse(
                user.getName(),
                user.getGender().getMessage(),
                user.getBirth(),
                user.getHometown().getMessage(),
                user.getLogin_id(),
                user.getPassword()
        );
    }
}
