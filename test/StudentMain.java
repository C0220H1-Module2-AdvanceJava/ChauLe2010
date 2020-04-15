import controller.StudentManagement;
import model.Student;
import java.time.LocalDate;
import java.util.*;

public class StudentMain {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManagement studentManagement = new StudentManagement();
    private static List<Student> studentList;

    public static void main(String[] args) {
        int choice;
        boolean isExit = false;
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
                System.out.println("You are using ArrayList for managing student");
                break;
            case 2:
                studentList = new LinkedList<>();
                System.out.println("You are using LinkList for managing student");
                break;
            case 0:
                System.out.println("Exit Program!");
                isExit = true;
                break;
        }

        while (!isExit) {
            displayMenu();
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            if (!isValidChoice(choice)) {
                System.out.println("Invalid choice, please choose again!");
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount: ");
                        int amount = scanner.nextInt();
                        for (int count = 1; count <= amount; count++) {
                            Student student = new Student();
                            updateStudentData(student);
                            System.out.println("Add Student " + count + ":");
                            studentList.add(student);
                        }
                        System.out.println("Database updated!");
                        displayList(studentList);
                        break;
                    case 2:
                        System.out.println("Enter ID: ");
                        String id = scanner.next();
                        Student student1 = studentManagement.searchStudentByID(studentList, id);
                        if (student1 != null) {
                            System.out.println("Student found: ");
                            System.out.println(student1);
                            updatePrompt(student1);
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;
                    case 3:
                        System.out.println("Enter name: ");
                        String name = scanner.next();
                        student1 = studentManagement.searchStudentByName(studentList, name);
                        if (student1 != null) {
                            System.out.println("Student found: ");
                            System.out.println(student1);
                            updatePrompt(student1);
                        } else {
                            System.out.println("Student not found!");
                        }
                        break;
                    case 4:
                        displayList(studentList);
                        break;
                    case 5:
                        Collection<Student> females = studentManagement.findFemaleStudent(studentList);
                        displayList(females);
                        break;
                    case 6:
                        Collection<Student> scholarship = studentManagement.findStudentHasScholarship(studentList);
                        displayList(scholarship);
                        break;
                    case 7:
                        System.out.print("Enter index you want to add: ");
                        int index = scanner.nextInt();
                        student1 = new Student();
                        updateStudentData(student1);
                        studentManagement.addStudentByIndex(studentList, student1,index);
                        break;
                    case 8:
                        System.out.println("1. Sort By Name");
                        System.out.println("2. Sort By Age");
                        System.out.println("3. Sort By Score");
                        System.out.print("Enter choice: ");
                        System.out.println("List before sort: ");
                        displayList(studentList);
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                studentManagement.sortByName(studentList);
                                break;
                            case 2:
                                studentManagement.sortByAge(studentList);
                                break;
                            case 3:
                                studentManagement.sortByAverageScore(studentList);
                                break;
                        }
                        System.out.println("List after sort: ");
                        displayList(studentList);
                    case 0:
                        System.out.println("Exit Program!");
                        isExit = true;
                        break;
                }
            }
        }
    }

    private static boolean isValidChoice(int choice) {
        return choice >= 0 && choice <= 7;
    }

    private static void displayMenu() {
        System.out.println("---------------------------------");
        System.out.println("1. Add Student");
        System.out.println("2. Search and update Student's information by id");
        System.out.println("3. Search and update Student's information by name");
        System.out.println("4. Display List Student");
        System.out.println("5. Display Female Student");
        System.out.println("6. Display Student has Scholarship");
        System.out.println("7. Add Student by position in List");
        System.out.println("8. Arrange List");
        System.out.println("0. Exit Program!");
    }

    private static void updateStudentData(Student student) {
        System.out.print("Enter Name: ");
        scanner.nextLine();
        student.setName(scanner.nextLine());
        System.out.print("Enter Gender: ");
        student.setGender(scanner.next());
        System.out.print("Enter Day of Birth: ");
        int day = scanner.nextInt();
        System.out.print("Enter Month of Birth: ");
        int month = scanner.nextInt();
        System.out.print("Enter Year of Birth: ");
        int year = scanner.nextInt();
        LocalDate birthDay = LocalDate.of(year, month, day);
        student.setBirthDate(birthDay);
        System.out.print("Enter Address: ");
        scanner.nextLine();
        student.setAddress(scanner.nextLine());
        System.out.print("Enter Student ID: ");
        student.setStudentID(scanner.nextLine());
        System.out.print("Enter average score: ");
        student.setAverageScore(scanner.nextDouble());
        System.out.print("Enter email: ");
        scanner.nextLine();
        student.setEmail(scanner.nextLine());
    }

    private static void updatePrompt(Student student) {
        char yesNoChoice;
        System.out.println("Do you want to update info on that student ?");
        System.out.print("Enter choice (y/n): ");
        yesNoChoice = scanner.next().toLowerCase().charAt(0);
        if (yesNoChoice == 'y') {
            updateStudentData(student);
        }
        System.out.println("Do you want to remove that student?");
        System.out.print("Enter choice (y/n): ");
        yesNoChoice = scanner.next().toLowerCase().charAt(0);
        if (yesNoChoice == 'y') {
            updateStudentData(student);
        }
    }

    private static void displayList(Collection<Student> list) {
        int count = 1;
        for (Student student : list) {
            System.out.println("---------------------------------");
            System.out.println("Student " + count);
            System.out.println(student);
            System.out.println("---------------------------------");
            count++;
        }
    }
}
