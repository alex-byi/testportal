package org.testportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testportal.entity.Topic;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
