package hw05.controller;

import hw05.service.EducationalGroupService;
import hw05.model.EducationalGroup;
import hw05.model.Teacher;
import hw05.model.Student;
import java.util.List;

public class Controller {
    private EducationalGroupService groupService;

    public Controller() {
        groupService = new EducationalGroupService();
    }

    public EducationalGroup createAndReturnEducationalGroup(Teacher teacher, List<Student> students) {
        return groupService.createEducationalGroup(teacher, students);
    }

    public void printTeacherAndStudentIds(EducationalGroup group) {
        Teacher teacher = group.getTeacher();
        List<Student> students = group.getStudents();

        System.out.println("Id преподавателя: " + teacher.getId());
        System.out.println("Id студентов:");
        for (Student student : students) {
            System.out.println("Id " + student.getId());
        }
    }
}
