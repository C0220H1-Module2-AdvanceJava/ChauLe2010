import controller.ArrayListStudent;
import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isExit = false;
        ArrayListStudent listStudent;
        System.out.println("Student Management Program!");
        System.out.println("1. Manage Student by ArrayList");
        System.out.println("2. Manage Student by LinkedList");
        System.out.println("0. Exit program!");
        System.out.print("Enter choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                listStudent = new ArrayListStudent();
                listStudent.add(new Student("10",8.5,"vanduc2514@gmail.com"));
                listStudent.add(new Student("11",1,"anhnam2514@gmail.com"));
                do {
                    displayMenu();
                    choice = scanner.nextInt();
                    if (isValidChoice(choice)) {
                        switch (choice) {
                            case 0:
                                System.out.println("Exit Program!");
                                isExit = true;
                                break;
                            case 1:
                                listStudent.addAllStudent();
                                break;
                            case 2:
                                listStudent.searchStudentByID();
                                break;
                            case 3:
                                listStudent.searchStudentByName();
                                break;
                            case 4:
                                listStudent.updateStudentByID();
                                break;
                            case 5:
                                listStudent.updateStudentByName();
                                break;
                            case 6:
                                listStudent.removeStudentByID();
                                break;
                            case 7:
                                listStudent.removeStudentByName();
                                break;
                            case 8:
                                listStudent.display();
                                break;
                            case 9:
                                listStudent.displayFemaleStudent();
                                break;
                            case 10:
                                listStudent.displayStudentHasScholarship();
                                break;
                        }
                    }
                } while (!isExit);
                break;
            case 2:
                break;
            case 0:
                System.out.println("Exit Program!");
                System.exit(0);
                break;
        }


    }

    private static void displayMenu() {
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
    }

    private static boolean isValidChoice(int choice) {
        for (int index = 0; index <= 11; index++) {
            if (choice == index) {
                return true;
            }
        }
        return false;
    }
}
