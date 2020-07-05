package org.testportal.service.topic;

import org.testportal.entity.Question;

import java.util.Optional;

public interface QuestionService {
    Optional<Question> findById(Long id);

    Question save(Question question);

    Iterable<Question> findAll();

    // TODO realize service
}
