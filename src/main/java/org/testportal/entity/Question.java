package org.testportal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "questions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question;

    private int answerAmount;

    @OneToOne (optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id")
    private Answer answer;
}
