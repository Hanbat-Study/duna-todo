package study.ToDoList.user;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;

@Primary
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin_idAndPassword(String loginId, String password);
}
