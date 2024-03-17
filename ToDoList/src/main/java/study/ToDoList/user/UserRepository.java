package study.ToDoList.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLoginIdAndPassword(String loginId, String password);
}
