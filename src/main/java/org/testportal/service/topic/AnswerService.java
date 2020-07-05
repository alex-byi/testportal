package org.testportal.service.topic;

import org.testportal.entity.Answer;

import java.util.Optional;

public interface AnswerService {
    Optional<Answer> findById(Long id);

    Answer save(Answer answer);

    Iterable<Answer> findAll();

    // TODO realize service
}
