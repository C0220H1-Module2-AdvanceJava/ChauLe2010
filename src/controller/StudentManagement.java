package controller;

import java.util.Scanner;

public abstract class StudentManagement {
    protected Scanner scanner = new Scanner(System.in);
    public abstract void display();
    public abstract void displayStudentHasScholarship();
    public abstract void displayFemaleStudent();
    public abstract void addAllStudent();
    public abstract void searchStudentByID();
    public abstract void searchStudentByName();
    public abstract void updateStudentByID();
    public abstract void updateStudentByName();
    public abstract void removeStudentByID();
    public abstract void removeStudentByName();
}
