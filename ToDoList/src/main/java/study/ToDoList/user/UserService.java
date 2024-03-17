package study.ToDoList.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void signin(UserParameter parameter) {
        User user = repository.findByLoginIdAndPassword(parameter.getLoginId(), parameter.getPassword());
//        if(user==null){
//            throw new Exception(NOT_FOUND);
//        }
        // 로그인 유저가 존재하는지, 없으면 에러
    }

    public UserResponse signup(UserRequest userRequest) {
        User user = repository.save(userRequest.to());
        return UserResponse.from(user);
    }
}
