package com.av.services.imp;

import com.av.domain.Student;
import com.av.services.StudentService;
import com.av.services.UiService;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    private final UiService uiService;

    public StudentServiceImpl(UiService uiService) {
        this.uiService = uiService;
    }

    @Override
    public Student getStudent() {
        var firstName = uiService.input("enter a first name");
        var lastName = uiService.input("enter a last name");
        return new Student(firstName, lastName);
    }
}
