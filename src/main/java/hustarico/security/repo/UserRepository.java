package hustarico.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hustarico.security.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    Optional<User> findByEmail(String email);

}