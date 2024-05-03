package mvc;

import java.util.Scanner;

public class StudentService {

    public Student createStudent(Scanner scanner){
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập điểm lý thuyết: ");
        double theoryPoint = scanner.nextDouble();

        System.out.print("Nhập điểm thực hành: ");
        double practicePoint = scanner.nextDouble();

        return new Student(name, theoryPoint, practicePoint);

    }
    public double calculateAvgPoint(double theoryPoint, double practicePoint) {
        return (theoryPoint + practicePoint) / 2;
    }
    public void printInfo(Student s){
        System.out.println("Thông tin học viên:");
        System.out.println("Mã học viên: " + s.getId());
        System.out.println("Tên học viên: " + s.getName());
        System.out.println("Điểm lý thuyết: " + s.getTheoryPoint());
        System.out.println("Điểm thực hành: " + s.getPracticePoint());
        System.out.println("Điểm trung bình: " + calculateAvgPoint(s.getTheoryPoint(), s.getPracticePoint()));

    }
}
