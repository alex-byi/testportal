package org.testportal.entity;

import lombok.*;

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

    @Column
    private String trueAnswer;

    @Column
    private String firstAnswer;

    @Column
    private String secondAnswer;

    @Column
    private String thirdAnswer;

    @Column
    private String fourthAnswer;

    @Column
    private String fifthAnswer;

    @Column
    private String sixthAnswer;

    @Column
    private String seventhAnswer;

    @Column
    private String eighthAnswer;

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
