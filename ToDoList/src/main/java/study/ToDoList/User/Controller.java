package study.ToDoList.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
public class Controller {

    @PostMapping("/api/user/signin")
    public DefaultRes<Dto> signin(){

        return DefaultRes.res(200,"");
    }

    @PostMapping("/api/user/signup")
    public HttpRequest signup(){

    }
}
