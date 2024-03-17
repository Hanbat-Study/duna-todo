package study.ToDoList.user;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@NoArgsConstructor
@Getter
public class UserParameter {

    @NotEmpty
    @Length(max = 255)
    private String login_id;

    @NotEmpty
    @Length(max = 255)
    private String password;


}
