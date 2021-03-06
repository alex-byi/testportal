package org.testportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.testportal.entity.User;

@Service
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
