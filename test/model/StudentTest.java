package model;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Scanner scanner = new Scanner(System.in);
    private LinkedList<Student> studentListTest = new LinkedList<>();

    @Test
    void testToString() {
        Student student = new Student();
        LocalDate birthDay = LocalDate.of(1992, 9, 17);
        student.setName("Duc");
        student.setGender("Male");
        student.setBirthDate(birthDay);
        student.setAddress("29 Hang Vai");
        student.setStudentID("2514");
        student.setAverageScore(9.5);
        student.setEmail("vanduc2514@gmail.com");
        System.out.println(student);
    }

    @Test
    void testComparable() {
        Student student = new Student();
        student.setName("Duc");
        student.setBirthDate(LocalDate.of(1992, 9, 17));
        student.setAverageScore(9.5);
        studentListTest.add(student);

        Student student1 = new Student();
        student1.setName("Nam");
        student1.setBirthDate(LocalDate.of(1994,4,20));
        student1.setAverageScore(6.5);
        studentListTest.add(student1);

        Student student2 = new Student();
        student2.setName("Hieu");
        student2.setBirthDate(LocalDate.of(1999,7,16));
        student2.setAverageScore(1.8);
        studentListTest.add(student2);

        Student student3 = new Student();
        student3.setName("Binh");
        student3.setBirthDate(LocalDate.of(1996,3,11));
        student3.setAverageScore(7.9);
        studentListTest.add(student3);

        System.out.println("Before sort: ");
        for (Student st : studentListTest) {
            System.out.println(st + "\n");
        }
        Collections.sort(studentListTest);
        System.out.println("After sort: ");
        for (Student st : studentListTest) {
            System.out.println(st + "\n");
        }
    }

    @Test
    void testComparatorAge() {
        Student student = new Student();
        student.setName("Duc");
        student.setBirthDate(LocalDate.of(1992, 9, 17));
        student.setAverageScore(9.5);
        studentListTest.add(student);

        Student student1 = new Student();
        student1.setName("Nam");
        student1.setBirthDate(LocalDate.of(1994,4,20));
        student1.setAverageScore(6.5);
        studentListTest.add(student1);

        Student student2 = new Student();
        student2.setName("Hieu");
        student2.setBirthDate(LocalDate.of(1999,7,16));
        student2.setAverageScore(1.8);
        studentListTest.add(student2);

        Student student3 = new Student();
        student3.setName("Binh");
        student3.setBirthDate(LocalDate.of(1996,3,11));
        student3.setAverageScore(7.9);
        studentListTest.add(student3);

        System.out.println("Before sort: ");
        for (Student st : studentListTest) {
            System.out.println(st + "\n");
        }
        Collections.sort(studentListTest, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                int ageStudent1 = LocalDate.now().getYear() - student1.getBirthDate().getYear();
                int ageStudent2 = LocalDate.now().getYear() - student2.getBirthDate().getYear();
                return ageStudent1 - ageStudent2;
            }
        });
        System.out.println("After sort: ");
        for (Student st : studentListTest) {
            System.out.println(st + "\n");
        }
    }

    @Test
    void testComparatorScore() {
        Student student = new Student();
        student.setName("Duc");
        student.setBirthDate(LocalDate.of(1992, 9, 17));
        student.setAverageScore(9.5);
        studentListTest.add(student);

        Student student1 = new Student();
        student1.setName("Nam");
        student1.setBirthDate(LocalDate.of(1994,4,20));
        student1.setAverageScore(6.5);
        studentListTest.add(student1);

        Student student2 = new Student();
        student2.setName("Hieu");
        student2.setBirthDate(LocalDate.of(1999,7,16));
        student2.setAverageScore(1.8);
        studentListTest.add(student2);

        Student student3 = new Student();
        student3.setName("Binh");
        student3.setBirthDate(LocalDate.of(1996,3,11));
        student3.setAverageScore(7.9);
        studentListTest.add(student3);

        System.out.println("Before sort: ");
        for (Student st : studentListTest) {
            System.out.println(st + "\n");
        }
        Collections.sort(studentListTest, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return (int) (student1.getAverageScore() - student2.getAverageScore());
            }
        });
        System.out.println("After sort: ");
        for (Student st : studentListTest) {
            System.out.println(st + "\n");
        }
    }
}