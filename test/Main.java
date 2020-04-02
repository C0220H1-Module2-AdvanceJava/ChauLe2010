import controller.StudentManagement;
import model.Student;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isExit = false;
        StudentManagement studentManagement = new StudentManagement();
        List<Student> studentList = new ArrayList<>();

        do {
            System.out.println("Student Management Program!");
            System.out.println("1. Manage Student by ArrayList");
            System.out.println("2. Manage Student by LinkedList");
            System.out.println("0. Exit program!");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
        } while (!isValidChoice(choice));

        switch (choice) {
            case 1:
                studentList = new ArrayList<>();
                studentList.add(new Student("10", 8.5, "vanduc2514@gmail.com"));
                studentList.add(new Student("11", 1, "anhnam420@gmail.com"));
                System.out.println("You are using ArrayList for managing student");
                break;
            case 2:
                studentList = new LinkedList<>();
                studentList.add(new Student("10", 8.5, "vanduc@gmail.com"));
                studentList.add(new Student("11", 1, "anhnam@gmail.com"));
                System.out.println("You are using LinkList for managing student");
                break;
            case 0:
                System.out.println("Exit Program!");
                isExit = true;
                break;
        }

        while (!isExit) {
            System.out.println("---------------------------------");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student's information by id");
            System.out.println("3. Search Student's information by name");
            System.out.println("4. Edit Student's information by id");
            System.out.println("5. Edit Student's information by name");
            System.out.println("6. Delete Student by id");
            System.out.println("7. Delete Student by name");
            System.out.println("8. Display List Student");
            System.out.println("9. Display Female Student");
            System.out.println("10. Display Student has Scholarship");
            System.out.println("11. Add Student by position in List");
            System.out.println("0. Exit Program!");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (isValidChoice(choice)) {
                switch (choice) {
                    case 1:
                        studentManagement.addAllStudent(studentList);
                        break;
                    case 2:
                        studentManagement.searchStudentByID(studentList);
                        break;
                    case 3:
                        studentManagement.searchStudentByName(studentList);
                        break;
                    case 4:
                        studentManagement.updateStudentByID(studentList);
                        break;
                    case 5:
                        studentManagement.updateStudentByName(studentList);
                        break;
                    case 6:
                        studentManagement.removeStudentByID(studentList);
                        break;
                    case 7:
                        studentManagement.removeStudentByName(studentList);
                        break;
                    case 8:
                        studentManagement.display(studentList);
                        break;
                    case 9:
                        studentManagement.displayFemaleStudent(studentList);
                        break;
                    case 10:
                        studentManagement.displayStudentHasScholarship(studentList);
                        break;
                    case 11:
                        studentManagement.addStudentByIndex(studentList);
                        break;
                    case 0:
                        System.out.println("Exit Program!");
                        isExit = true;
                        break;
                }
            }
        }
    }

    private static boolean isValidChoice(int choice) {
        for (int index = 0; index <= 11; index++) {
            if (choice == index) {
                return true;
            }
        }
        System.out.println("Invalid Choice! Please choose again!");
        return false;
    }
}
