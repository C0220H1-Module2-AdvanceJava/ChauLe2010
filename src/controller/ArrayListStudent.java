package controller;

import model.Student;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListStudent extends StudentManagement {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private model.Student students[];

    public ArrayListStudent() {
        students = new model.Student[DEFAULT_CAPACITY];
    }

    public ArrayListStudent(int capacity) {
        students = new model.Student[capacity];
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = students.length * 2;
        students = Arrays.copyOf(students, newCapacity);
    }

    public Student[] getList() {
        return students;
    }

    public void add(Student student) {
        if (size == students.length) {
            ensureCapacity();
        }
        students[size++] = student;
    }

    public void add(Student student, int index) {
        if (size == students.length) {
            ensureCapacity();
        }
        for (int indexList = size - 1; indexList >= index; indexList--) {
            students[indexList + 1] = students[indexList];
        }
        students[index] = student;
        size++;
    }

    public void remove() {
        students[size - 1] = null;
        size--;
    }

    public void remove(int index) {
        for (int indexList = index; indexList < size; indexList++) {
            students[indexList] = students[indexList + 1];
        }
        students[size - 1] = null;
        size--;
    }

    public int searchByID(String id) {
        for (int index = 0; index < size; index++) {
            if (students[index].getStudentID().equals(id)) {
                return index;
            }
        }
        return -1;
    }

    public int searchByName(String name) {
        for (int index = 0; index < size; index++) {
            if (students[index].getName().equals(name)) {
                return index;
            }
        }
        return -1;
    }

    public Student get(int index) {
        return students[index];
    }

    @Override
    public void display() {
        for (int index = 0; index < size; index++) {
            System.out.println("Student: " + (index + 1));
            students[index].displayData();
        }
    }

    public void displayStudentHasScholarship() {
        for (int index = 0; index < size; index++) {
            if (students[index].isValidForScholarship()) {
                System.out.println("Student: " + (index + 1));
                students[index].displayData();

            }
        }
    }

    public void displayFemaleStudent() {
        for (int index = 0; index < size; index++) {
            if (students[index].isFemale()) {
                System.out.println("Student: " + (index + 1));
                students[index].displayData();
            }
        }
    }

    public void addAllStudent() {
        System.out.print("Enter amount of students: ");
        int amount = scanner.nextInt();
        if (size > DEFAULT_CAPACITY) {
            size = amount;
        }
        for (int index = 1; index <= amount; index++) {
            System.out.println("Student: " + index);
            Student student = new Student();
            student.inputData();
            add(student);
        }
    }

    public void searchStudentByID() {
        System.out.print("Enter Student's ID: ");
        String id = scanner.next();
        int index = searchByID(id);
        if (index < 0) {
            System.out.println("Student is not in the list!");
        } else {
            get(index).displayData();
        }
    }

    public void searchStudentByName() {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        int index = searchByName(name);
        if (index < 0) {
            System.out.println("Student is not in the list!");
        } else {
            get(index).displayData();
        }
    }

    public void updateStudentByID() {
        System.out.print("Enter Student's id: ");
        String id = scanner.next();
        int index = searchByID(id);
        if (index < 0) {
            System.out.println("Student is not in the list!");
        } else {
            get(index).displayData();
            System.out.println();
            System.out.println("Data's above will be replace! ");
            get(index).inputData();
        }
    }

    public void updateStudentByName() {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        int index = searchByName(name);
        if (index < 0) {
            System.out.println("Student is not in the list!");
        } else {
            get(index).displayData();
            System.out.println();
            System.out.println("Data's above will be replace! ");
            get(index).inputData();
        }
    }

    public void removeStudentByID() {
        System.out.print("Enter Student's id: ");
        String id = scanner.next();
        int index = searchByID(id);
        if (index < 0) {
            System.out.println("Student is not in the list!");
        } else {
            System.out.println("Data's above will be deleted! ");
            System.out.print("Do you want to delete ? (yes/no): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                remove(index);
                System.out.println("Successful!");
            }
        }
    }

    public void removeStudentByName() {
        System.out.print("Enter Student's name: ");
        String name = scanner.nextLine();
        int index = searchByName(name);
        if (index < 0) {
            System.out.println("Student is not in the list!");
        } else {
            System.out.println("Data's above will be deleted! ");
            System.out.print("Do you want to delete ? (yes/no): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                remove(index);
                System.out.println("Successful!");
            }
        }
    }
}
