package com.sysoiev.java_annotations;

public class Exam {
    private AnswerChecker answerChecker;

    public Exam(AnswerChecker answerChecker) {
        System.out.println("Exam Constructor");
        this.answerChecker = answerChecker;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
