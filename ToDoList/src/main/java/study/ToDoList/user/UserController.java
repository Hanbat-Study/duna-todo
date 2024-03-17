package study.ToDoList.user;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static study.ToDoList.user.StatusCode.CREATED;
import static study.ToDoList.user.StatusCode.OK;

@RestController
@Primary
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/api/user/signin")
    public DefaultRes signin(@RequestBody UserParameter userParameter) {
        service.signin(userParameter);
        return DefaultRes.res(OK, "로그인 완료");
    }

    @PostMapping("/api/user/signup")
    public DefaultRes<UserResponse> signup(@RequestBody UserRequest userRequest) {
        return DefaultRes.res(CREATED, "회원가입 완료", service.signup(userRequest));
    }
}
