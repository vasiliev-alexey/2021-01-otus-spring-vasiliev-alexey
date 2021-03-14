package com.av.services.imp;

import com.av.domain.ExamReport;
import java.util.logging.Level;
import java.util.logging.Logger;


import com.av.services.LocaleService;
import com.av.services.StudentService;
import com.av.services.TestSystemService;
import com.av.services.UiService;
import com.av.services.ExaminationService;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service("examinationService")
public class ExaminationServiceImpl implements ExaminationService {

    private static final int MAX_ANSWER = 4;
    private static final int EXAM_ANSWER_COUNT = 3;
    private static final Logger LOGGER = Logger.getLogger(ExaminationServiceImpl.class.getName());

    private final TestSystemService testSystemService;
    private final UiService uiService;
    private final StudentService studentService;
    private final MessageSource messageSource;
    private final LocaleService localeService;

    public ExaminationServiceImpl(
        TestSystemService testSystemService,
        UiService inputService,
        StudentService studentService,
        MessageSource messageSource,
        LocaleService localeService
    ) {
        this.testSystemService = testSystemService;
        this.uiService = inputService;
        this.studentService = studentService;

        this.messageSource = messageSource;
        this.localeService = localeService;
    }

    @Override
    public void takeExam() {
        var student = studentService.getStudent();

        if (student == null) {
            throw new IllegalArgumentException("Student not found");
        }

        var answerList = testSystemService.getTestList(EXAM_ANSWER_COUNT);

        var reportPattern = messageSource.getMessage("report.pattern", null, null, localeService.getLocaleForSession());

        var examReport = new ExamReport(student, reportPattern);
        answerList.forEach(
            t -> {
                var enteredValue = uiService.input(testSystemService.formatTestCase(t));
                var numAns = 0;
                try {
                    numAns = Integer.parseInt(enteredValue);
                } catch (NumberFormatException ex) {
                    LOGGER.log(Level.INFO, String.format("Error input:%s", enteredValue), ex);
                }

                if (numAns > 0 && numAns < MAX_ANSWER && numAns - 1 == t.getRightAnswer()) {
                    examReport.incrementRight();
                } else {
                    examReport.incrementWrong();
                    LOGGER.info("wrong -> right answer:" + t.getAnswers().get(t.getRightAnswer()));
                }
            }
        );
        uiService.output(examReport.formatReport());
    }
}
