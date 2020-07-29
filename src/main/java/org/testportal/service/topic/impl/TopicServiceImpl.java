package org.testportal.service.topic.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.testportal.entity.Topic;
import org.testportal.repository.TopicRepository;
import org.testportal.service.topic.TopicService;

import java.util.Optional;

@Transactional
@Service
public class TopicServiceImpl implements TopicService {

    private final TopicRepository topicRepository;

    public TopicServiceImpl (TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public Optional<Topic> findById(Long id) {
        return topicRepository.findById(id);
    }

    @Override
    public Topic save(Topic topic) {
        return topicRepository.save(topic);
    }

    @Override
    public Iterable<Topic> findAll() {
        return topicRepository.findAll();
    }
    //TODO impl
}
