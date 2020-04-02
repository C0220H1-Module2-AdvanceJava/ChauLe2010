package controller;

import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private Scanner scanner = new Scanner(System.in);

    public void display(List<Student> list) {
        int index = 1;
        for (Student student : list) {
            System.out.println("Student: " + index);
            student.displayData();
            index++;
        }
    }

    public void displayStudentHasScholarship(List<Student> list) {
        int index = 1;
        for (Student student : list) {
            if (student.isValidForScholarship()) {
                System.out.println("Student: " + index);
                student.displayData();
                index++;
            }
        }
    }

    public void displayFemaleStudent(List<Student> list) {
        int index = 1;
        for (Student student : list) {
            if (student.isFemale()) {
                System.out.println("Student: " + index);
                student.displayData();
                index++;
            }
        }
    }

    public void addAllStudent(List<Student> list) {
        System.out.print("Enter amount of students: ");
        int amount = scanner.nextInt();
        for (int index = 1; index <= amount; index++) {
            System.out.println("Student: " + index);
            Student student = new Student();
            student.inputData();
            list.add(student);
        }
    }

    public Student searchStudentByID(List<Student> list) {
        System.out.print("Enter Student's ID: ");
        String id = scanner.next();
        for (Student student : list) {
            if (student.getStudentID().equals(id)) {
                student.displayData();
                return student;
            }
        }
        System.out.println("Student not in the list!");
        return null;
    }

    public Student searchStudentByName(List<Student> list) {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        for (Student student : list) {
            if (student.getStudentID().equals(name)) {
                student.displayData();
                return student;
            }
        }
        System.out.println("Student not in the list!");
        return null;
    }

    public void updateStudentByID(List<Student> list) {
        Student student = searchStudentByID(list);
        if (student != null) {
            System.out.println("Data's above will be replaced! ");
            student.inputData();
        }
    }

    public void updateStudentByName(List<Student> list) {
        Student student = searchStudentByName(list);
        if (student != null) {
            System.out.println("Data's above will be replaced! ");
            student.inputData();
        }
    }

    public void removeStudentByID(List<Student> list) {
        Student student = searchStudentByID(list);
        if (student != null) {
            System.out.println("Data's above will be deleted! ");
            System.out.print("Do you want to delete ? (yes/no): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                list.remove(student);
                System.out.println("Successful!");
            }
        }
    }

    public void removeStudentByName(List<Student> list) {
        Student student = searchStudentByName(list);
        if (student != null) {
            System.out.println("Data's above will be deleted! ");
            System.out.print("Do you want to delete ? (yes/no): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                list.remove(student);
                System.out.println("Successful!");
            }
        }
    }

    public void addStudentByIndex(List<Student> list) {
        System.out.print("Enter position you want to add: ");
        int index = scanner.nextInt();
        if (index < list.size()) {
            Student newStudent = new Student();
            newStudent.inputData();
            list.add(index,newStudent);
            return;
        }
        System.out.println("Cannot add! Please enter a position in list's range!");
    }
}
