package org.testportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testportal.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
