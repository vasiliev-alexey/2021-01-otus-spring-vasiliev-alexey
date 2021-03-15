package com.av.domain;

public class ExamReport {

    private final Student student;
    private final String reportPattern;
    private int rightAnswerCount;
    private int wrongAnswerCount;

    public ExamReport(Student student, String reportPattern) {
        this.student = student;
        this.reportPattern = reportPattern;
        this.rightAnswerCount = 0;
    }

    public void incrementRight() {
        rightAnswerCount++;
    }

    public void incrementWrong() {
        wrongAnswerCount++;
    }

    public String formatReport() {
        return String.format(
            //            "FirstName: %s LastName: %s Right Answers: %d Wrong Answers: %d",
            reportPattern,
            student.getFirstName(),
            student.getLastName(),
            rightAnswerCount,
            wrongAnswerCount
        );
    }
}
