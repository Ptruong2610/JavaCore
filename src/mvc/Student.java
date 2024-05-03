package mvc;

import java.util.Random;

public class Student {
    private int id;
    private String name;
    private double theoryPoint ;
    private double practicePoint;

    public Student() {

    }

    public Student( String name, double theoryPoint, double practicePoint) {
        Random random = new Random();
        this.id = random.nextInt(100)+1;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(double theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }
}
