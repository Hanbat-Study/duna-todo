package study.ToDoList.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
    User findByLogin_idAndPassword(String loginId, String password);
}
