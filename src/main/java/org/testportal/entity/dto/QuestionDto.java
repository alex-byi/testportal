package org.testportal.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.testportal.entity.Answer;

import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class QuestionDto {
    private Long id;

    private String question;

    private int answerAmount;

    private Answer answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDto that = (QuestionDto) o;
        return answerAmount == that.answerAmount &&
                id.equals(that.id) &&
                question.equals(that.question) &&
                Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, answerAmount, answer);
    }
}
