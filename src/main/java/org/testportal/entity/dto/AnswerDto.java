package org.testportal.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.testportal.entity.Question;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDto {

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

    private Question question;


    public Long getId() {
        return id;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public String getFifthAnswer() {
        return fifthAnswer;
    }

    public String getSixthAnswer() {
        return sixthAnswer;
    }

    public String getSeventhAnswer() {
        return seventhAnswer;
    }

    public String getEighthAnswer() {
        return eighthAnswer;
    }

    public Question getQuestion() {
        return question;
    }
}
