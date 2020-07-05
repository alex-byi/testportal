package org.testportal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "answers")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trueAnswer;

    private String firstAnswer;

    private String secondAnswer;

    private String thirdAnswer;

    private String fourthAnswer;

    private String fifthAnswer;

    private String sixthAnswer;

    private String seventhAnswer;

    private String eighthAnswer;

    @JsonIgnore
    @OneToOne(optional = false, mappedBy = "answer")
    private Question question;
}
