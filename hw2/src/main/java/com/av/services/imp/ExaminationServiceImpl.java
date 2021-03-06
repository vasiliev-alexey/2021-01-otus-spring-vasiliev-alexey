package com.av.services.imp;

import com.av.domain.ExamReport;
import com.av.domain.Student;
import com.av.services.ExaminationService;
import com.av.services.StudentService;
import com.av.services.TestSystemService;
import com.av.services.UiService;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service("examinationService")
public class ExaminationServiceImpl implements ExaminationService {

    private static final int MAX_ANSWER = 4;
    private static final int EXAM_ANSWER_COUNT = 3;
    private static Logger logger = Logger.getLogger(ExaminationServiceImpl.class.getName());

    private final TestSystemService testSystemService;
    private final UiService uiService;
    private final StudentService studentService;

    public ExaminationServiceImpl(TestSystemService testSystemService, UiService inputService, StudentService studentService) {
        this.testSystemService = testSystemService;
        this.uiService = inputService;
        this.studentService = studentService;
    }

    @Override
    public void takeExam() {

        var student = studentService.getStudent();

        if (student == null) {
            throw new IllegalArgumentException("Student not found");
        }

        var answerList = testSystemService.getTestList(EXAM_ANSWER_COUNT);
        var examReport = new ExamReport(student);
        answerList.forEach(
                t -> {
                    var enteredValue = uiService.input(testSystemService.formatTestCase(t));
                    var numAns = 0;
                    try {
                        numAns = Integer.parseInt(enteredValue);
                    } catch (NumberFormatException ex) {
                        logger.log(Level.INFO, String.format("Error input:%s", enteredValue), ex);
                    }

                    if (numAns > 0 && numAns < MAX_ANSWER && numAns - 1 == t.getRightAnswer()) {
                        examReport.incrementRight();
                    } else {
                        examReport.incrementWrong();
                        logger.info("wrong -> right answer:" + t.getAnswers().get(t.getRightAnswer()));
                    }
                }
        );
        uiService.output(String.format("Exam report:%s ", examReport.formatReport()));
    }
}
