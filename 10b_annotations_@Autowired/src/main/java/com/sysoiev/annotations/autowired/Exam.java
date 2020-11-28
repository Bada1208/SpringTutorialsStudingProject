package com.sysoiev.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Exam {
    private AnswerChecker answerChecker;

    @Autowired
    public Exam(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
