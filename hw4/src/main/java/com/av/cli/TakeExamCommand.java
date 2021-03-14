package com.av.cli;

import com.av.services.ExaminationService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class TakeExamCommand {

    private final ExaminationService examinationService;

    public TakeExamCommand(ExaminationService examinationService) {
        this.examinationService = examinationService;
    }

    @ShellMethod("Take exam and report generate")
    public void takeExam() {
        examinationService.takeExam();
    }
}
