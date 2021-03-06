package org.testportal.service.topic.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.testportal.entity.Answer;
import org.testportal.repository.AnswerRepository;
import org.testportal.service.topic.AnswerService;

import java.util.Optional;

@Transactional
@Service
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;

    public AnswerServiceImpl(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @Override
    public Optional<Answer> findById(Long id) {
        return answerRepository.findById(id);
    }

    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }

    @Override
    public Iterable<Answer> findAll() {
        return answerRepository.findAll();
    }
}
