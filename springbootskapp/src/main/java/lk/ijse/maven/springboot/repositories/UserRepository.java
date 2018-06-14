package lk.ijse.maven.springboot.repositories;

import lk.ijse.maven.springboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}
