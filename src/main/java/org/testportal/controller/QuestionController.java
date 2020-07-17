package org.testportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.testportal.entity.Question;
import org.testportal.entity.dto.QuestionDto;
import org.testportal.service.topic.QuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping(value = "/{id}")
    public QuestionDto findOne(@PathVariable Long id){
        Question entity = questionService.findById(id)
                .orElseThrow(() ->new ResponseStatusException(HttpStatus.NOT_FOUND));
        return convertToDto(entity);
    }

//    @PostMapping
//    public QuestionDto save(@RequestBody Question question){
//        Question entity = questionService.save(question);
//        return convertToDto(entity);
//    }

    private QuestionDto convertToDto (Question entity){
        return QuestionDto.builder().id(entity.getId()).question(entity.getQuestion())
                .answer(entity.getAnswer()).answerAmount(entity.getAnswerAmount()).build();
    }

    @GetMapping
    public Collection<QuestionDto> findAll(){
        Iterable<Question> questions = this.questionService.findAll();
        Set<QuestionDto> questionDtos = new HashSet<>();
        questions.forEach(t -> questionDtos.add(convertToDto(t)));
        return questionDtos;
    }
}
