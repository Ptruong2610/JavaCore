package mvc;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();

        Student student = studentService.createStudent(scanner);
        studentService.printInfo(student);
    }
}
