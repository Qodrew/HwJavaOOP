package hw05.service;

import hw05.model.EducationalGroup;
import hw05.model.Teacher;
import hw05.model.Student;
import java.util.List;

public class EducationalGroupService {
    public EducationalGroup createEducationalGroup(Teacher teacher, List<Student> students) {
        return new EducationalGroup(teacher, students);
    }
}
