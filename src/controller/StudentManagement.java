package controller;

import model.Student;

import java.time.LocalDate;
import java.util.*;

public class StudentManagement {
    public Collection<Student> findStudentHasScholarship(List<Student> list) {
        List<Student> scholarShip = new LinkedList<>();
        for (Student student : list) {
            if (student.isValidForScholarship()) {
                scholarShip.add(student);
            }
        }
        return scholarShip;
    }

    public Collection<Student> findFemaleStudent(List<Student> list) {
        List<Student> females = new LinkedList<>();
        for (Student student : list) {
            if (student.isFemale()) {
                females.add(student);
            }
        }
        return females;
    }

    public Student searchStudentByID(List<Student> list, String id) {
        for (Student student : list) {
            if (student.getStudentID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public Student searchStudentByName(List<Student> list, String name) {
        for (Student student : list) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(List<Student> list, Student student) {
        if (student != null) {
            list.remove(student);
        }
    }

    public boolean addStudentByIndex(List<Student> list, Student student, int index) {
        if (index < list.size()) {
            list.add(index, student);
            return true;
        }
        return false;
    }

    public void sortByName(List<Student> list) {
        Collections.sort(list);
    }


    public void sortByAge(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int age1 = LocalDate.now().getYear() - student1.getBirthDate().getYear();
                int age2 = LocalDate.now().getYear() - student2.getBirthDate().getYear();
                return age1 - age2;
            }
        });
    }


    public void sortByAverageScore(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (int) (student1.getAverageScore() - student2.getAverageScore());
            }
        });
    }
}
