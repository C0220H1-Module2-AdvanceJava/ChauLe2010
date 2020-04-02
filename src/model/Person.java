package model;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private int[] birthDate = new int[3];
    private String address;

    public Person(String name, String gender, int[] birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int[] birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Gender (Male/Female): ");
        gender = scanner.next();
        System.out.println("Enter Birth Date ");
        System.out.print("Enter Day: ");
        birthDate[0] = scanner.nextInt();
        System.out.print("Enter Month: ");
        birthDate[1] = scanner.nextInt();
        System.out.print("Enter Year: ");
        birthDate[2] = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter address: ");
        address = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("-------------------------------");
        System.out.printf("Name: %s \n", name);
        System.out.printf("Gender: %s \n", gender);
        System.out.printf("Date of Birth: %d/%d/%d \n", birthDate[0],birthDate[1],birthDate[2]);
        System.out.printf("Address: %s \n", address);
    }
}
