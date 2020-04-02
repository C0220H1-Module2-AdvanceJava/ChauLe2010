package model;

import java.util.Scanner;

public class Student extends Person {
    private String studentID;
    private double averageScore;
    private String email;
    public static final double MINIMUM_SCHOLARSHIP_SCORE = 8.0;

    public Student(String name, String gender, int[] birthDate, String address, String studentID, double averageScore, String email) {
        super(name, gender, birthDate, address);
        this.studentID = studentID;
        this.averageScore = averageScore;
        this.email = email;
    }

    public Student(String studentID, double averageScore, String email) {
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
        if (averageScore >= MINIMUM_SCHOLARSHIP_SCORE) {
            return true;
        }
        return false;
    }

    public boolean isFemale() {
        if (getName().equals("female")) {
            return true;
        }
        return false;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        super.inputData();
        System.out.print("Enter StudentID: ");
        studentID = scanner.next();
        System.out.print("Enter average Score: ");
        averageScore = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Student email: ");
        email = scanner.nextLine();
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.printf("StudentID: %s \n",studentID);
        System.out.printf("Average Score: %.2f \n",averageScore);
        System.out.printf("Email: %s \n", email);
        System.out.printf("Is Valid for scholarship: %s \n",isValidForScholarship());
    }
}
