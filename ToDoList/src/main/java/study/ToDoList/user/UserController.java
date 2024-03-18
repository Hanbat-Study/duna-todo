package study.ToDoList.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static study.ToDoList.user.StatusCode.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/api/user/signin")
    public ResponseEntity signin(@RequestBody UserParameter userParameter) {
        try {
            service.signin(userParameter);
        } catch (Exception e) {
            return new ResponseEntity(DefaultRes.res(BAD_REQUEST, e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(DefaultRes.res(OK, "로그인 완료"), HttpStatus.OK);
    }

    @PostMapping("/api/user/signup")
    public ResponseEntity signup(@RequestBody UserRequest userRequest) {
        UserResponse response = null;
        try {
            response = service.signup(userRequest);
        } catch (Exception e) {
            return new ResponseEntity(DefaultRes.res(CREATED, e.getMessage(), response), HttpStatus.CREATED);
        }
        return new ResponseEntity(DefaultRes.res(CREATED, "회원가입 완료", response), HttpStatus.CREATED);
    }
}
