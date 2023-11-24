package hw05;

import java.util.List;

import hw05.controller.Controller;
import hw05.model.Student;
import hw05.model.Teacher;
import hw05.model.EducationalGroup;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        Teacher teacher = new Teacher(1, "John Doe");
        List<Student> students = List.of(
            new Student(1, "John"),
            new Student(2, "Elle"),
            new Student(3, "Smile")
        );

        Controller controller = new Controller();
        EducationalGroup group = controller.createAndReturnEducationalGroup(teacher, students);
        
        System.out.println("Учебная группа с преподавателем " + group.getTeacher().getName() + " и " +
                group.getStudents().size() + " студентами: создана.");
        controller.printTeacherAndStudentIds(group);

    }
}
