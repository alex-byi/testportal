package org.testportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.testportal.entity.Answer;
import org.testportal.entity.Topic;
import org.testportal.entity.dto.AnswerDto;
import org.testportal.entity.dto.TopicDto;
import org.testportal.service.topic.AnswerService;
import org.testportal.service.topic.TopicService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PortalController {

    @Autowired
    private AnswerService answerService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(value = "/{id}")
    public AnswerDto findOne(@PathVariable Long id){
        Answer entity = answerService.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(entity);
    }

    @GetMapping
    public Collection<AnswerDto> findAll(){
        Iterable<Answer> answers = this.answerService.findAll();
        List<AnswerDto> answerDtoList = new ArrayList<>();
        answers.forEach(t -> answerDtoList.add(convertToDto(t)));
        return answerDtoList;
    }

    protected AnswerDto convertToDto (Answer entity){
        return new AnswerDto(entity.getId(), entity.getTrueAnswer(), entity.getFirstAnswer(),
                entity.getSecondAnswer(), entity.getThirdAnswer(), entity.getFourthAnswer(),
                entity.getFifthAnswer(), entity.getSixthAnswer(), entity.getSeventhAnswer(),
                entity.getEighthAnswer(), entity.getQuestion());
    }
}
