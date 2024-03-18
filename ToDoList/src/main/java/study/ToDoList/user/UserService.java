package study.ToDoList.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void signin(UserParameter parameter) {
        User user = repository.findByLoginIdAndPassword(parameter.getLoginId(), parameter.getPassword());
        if (user == null) {
            throw new RuntimeException("로그인 실패");
        }
    }

    public UserResponse signup(UserRequest userRequest) {
        User requestUser = userRequest.to();
        if (repository.findByLoginId(requestUser.getLoginId()) == null) {
            throw new RuntimeException("동일한 아이디가 존재");
        }
        User user = repository.save(requestUser);
        return UserResponse.from(user);
    }
}
