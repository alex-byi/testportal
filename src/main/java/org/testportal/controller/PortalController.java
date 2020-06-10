package org.testportal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.testportal.entity.Topic;
import org.testportal.entity.dto.TopicDto;
import org.testportal.service.topic.TopicService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PortalController {

    private TopicService topicService;

    public PortalController(TopicService topicService) {
        this.topicService = topicService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/{id}")
    public TopicDto findOne(@PathVariable Long id){
        Topic entity = topicService.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(entity);
    }

    @GetMapping
    public Collection<TopicDto> findAll(){
        Iterable<Topic> topics = this.topicService.findAll();
        List<TopicDto> topicDtoList = new ArrayList<>();
        topics.forEach(t -> topicDtoList.add(convertToDto(t)));
        return topicDtoList;
    }

    protected TopicDto convertToDto (Topic entity){
        return new TopicDto(entity.getId(), entity.getTopic());
    }
}
