package org.testportal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return id.equals(answer.id) &&
                trueAnswer.equals(answer.trueAnswer) &&
                firstAnswer.equals(answer.firstAnswer) &&
                Objects.equals(secondAnswer, answer.secondAnswer) &&
                Objects.equals(thirdAnswer, answer.thirdAnswer) &&
                Objects.equals(fourthAnswer, answer.fourthAnswer) &&
                Objects.equals(fifthAnswer, answer.fifthAnswer) &&
                Objects.equals(sixthAnswer, answer.sixthAnswer) &&
                Objects.equals(seventhAnswer, answer.seventhAnswer) &&
                Objects.equals(eighthAnswer, answer.eighthAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, trueAnswer, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, fifthAnswer, sixthAnswer, seventhAnswer, eighthAnswer);
    }
}
