package org.testportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.testportal.entity.Answer;
import org.testportal.entity.dto.AnswerDto;
import org.testportal.service.topic.AnswerService;

import java.util.*;

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
        Set<AnswerDto> answerDto = new HashSet<>();
        answers.forEach(t -> answerDto.add(convertToDto(t)));
        return answerDto;
    }

    protected AnswerDto convertToDto (Answer entity){
        return AnswerDto.builder().id(entity.getId()).trueAnswer(entity.getTrueAnswer())
                .firstAnswer(entity.getFirstAnswer()).secondAnswer(entity.getSecondAnswer())
                .thirdAnswer(entity.getThirdAnswer()).fourthAnswer(entity.getFourthAnswer())
                .fifthAnswer(entity.getFifthAnswer()).sixthAnswer(entity.getSixthAnswer())
                .seventhAnswer(entity.getSeventhAnswer()).eighthAnswer(entity.getEighthAnswer()).build();
    }
}
