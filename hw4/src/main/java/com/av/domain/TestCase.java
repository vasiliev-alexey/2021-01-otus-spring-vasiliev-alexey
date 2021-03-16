package com.av.domain;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class TestCase {

    private int id;
    private String question;
    private short rightAnswer;
    private List<String> answers;

    public TestCase() {
        answers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public short getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(short rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answerList) {
        this.answers = answerList;
    }

    @Override
    public String toString() {
        return (
            MessageFormat.format(
                "TestCase'{'id={0}, question=''{1}'', rightAnswer={2}, answers={3}'}'",
                id,
                question,
                rightAnswer,
                answers
            )
        );
    }
}
