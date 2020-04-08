package model;

import java.time.LocalDate;

public class Person {
    private static final LocalDate DEFAULT_BIRTH = LocalDate.of(1999,9,19);
    private String name;
    private String gender;
    private LocalDate birthDate = DEFAULT_BIRTH;
    private String address;

    public Person(String name, String gender, LocalDate birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Person() {
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Gender: " + gender + '\n' +
                "Birth Day: " + birthDate.toString() + '\n' +
                "Address: " + address;
    }
}
