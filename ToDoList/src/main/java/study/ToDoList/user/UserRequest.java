package study.ToDoList.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
public class UserRequest {

    @NotEmpty
    @Length(max = 255)
    private String name;

    @NotNull
    private Gender gender;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private LocalDate birth;

    @NotNull
    private Hometown hometown;

    @NotEmpty
    @Length(max = 255)
    private String loginId;

    @NotEmpty
    @Length(max = 255)
    private String password;

    User to() {
        return new User(name, gender, birth, hometown, loginId, password);
    }
}
