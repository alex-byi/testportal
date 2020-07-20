package org.testportal.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.testportal.entity.Question;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerDto answerDto = (AnswerDto) o;
        return id.equals(answerDto.id) &&
                trueAnswer.equals(answerDto.trueAnswer) &&
                firstAnswer.equals(answerDto.firstAnswer) &&
                Objects.equals(secondAnswer, answerDto.secondAnswer) &&
                Objects.equals(thirdAnswer, answerDto.thirdAnswer) &&
                Objects.equals(fourthAnswer, answerDto.fourthAnswer) &&
                Objects.equals(fifthAnswer, answerDto.fifthAnswer) &&
                Objects.equals(sixthAnswer, answerDto.sixthAnswer) &&
                Objects.equals(seventhAnswer, answerDto.seventhAnswer) &&
                Objects.equals(eighthAnswer, answerDto.eighthAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trueAnswer, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, fifthAnswer, sixthAnswer, seventhAnswer, eighthAnswer);
    }
}
