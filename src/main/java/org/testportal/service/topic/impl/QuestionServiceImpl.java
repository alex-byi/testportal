package org.testportal.service.topic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.testportal.entity.Question;
import org.testportal.repository.QuestionRepository;
import org.testportal.service.topic.QuestionService;

import java.util.Optional;

@Transactional
@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Optional<Question> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Question save(Question question) {
        return null;
    }

    @Override
    public Iterable<Question> findAll() {
        return null;
    }
    //TODO impl

}
