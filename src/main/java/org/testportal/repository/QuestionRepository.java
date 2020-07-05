package org.testportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.testportal.entity.Question;

@Service
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
