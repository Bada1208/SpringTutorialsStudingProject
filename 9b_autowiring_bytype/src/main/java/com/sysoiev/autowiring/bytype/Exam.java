package com.sysoiev.autowiring.bytype;

public class Exam {
    private AnswerChecker answerChecker;
    private String subject;


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We`ve just set answerChecker using setter.");
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
