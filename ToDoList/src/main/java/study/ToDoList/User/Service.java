package study.ToDoList.User;

import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final Repository repository;

    public void signin(UserParameter parameter) {
        repository.findByLogin_idAndPassword(parameter.getLogin_id(), parameter.getPassword());

    }

    public void signup(UserRequest userRequest) {
        repository.save(userRequest.to());
    }
}
