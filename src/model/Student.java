package model;

import java.time.LocalDate;

public class Student extends Person implements Comparable<Student>{
    private String studentID;
    private double averageScore;
    private String email;
    public static final double MINIMUM_SCHOLARSHIP_SCORE = 8.0;

    public Student(String name, String gender, LocalDate birthDate, String address, String studentID, double averageScore, String email) {
        super(name, gender, birthDate, address);
        this.studentID = studentID;
        this.averageScore = averageScore;
        this.email = email;
    }

    public Student() {}

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidForScholarship() {
        return averageScore >= MINIMUM_SCHOLARSHIP_SCORE;
    }

    public boolean isFemale() {
        return getName().equals("female");
    }

    @Override
    public String toString() {
        return  super.toString() + '\n' +
                "StudentID: " + studentID + '\n' +
                "AverageScore: " + averageScore + '\n' +
                "Email: " + email;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
