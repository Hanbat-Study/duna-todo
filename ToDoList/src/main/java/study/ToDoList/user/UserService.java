package study.ToDoList.user;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Primary
public class UserService {

    private final UserRepository repository;

    public void signin(UserParameter parameter) {
        User user = repository.findByLogin_idAndPassword(parameter.getLogin_id(), parameter.getPassword());
//        if(user==null){
//            throw new Exception(NOT_FOUND);
//        }
    }

    public UserResponse signup(UserRequest userRequest) {
        User user = repository.save(userRequest.to());
        return UserResponse.from(user);
    }
}
