package org.testportal.service.topic;

import org.testportal.entity.Topic;

import java.util.Optional;

public interface TopicService {
    Optional<Topic> findById(Long id);

    Topic save(Topic topic);

    Iterable<Topic> findAll();
    // TODO realize service
}
