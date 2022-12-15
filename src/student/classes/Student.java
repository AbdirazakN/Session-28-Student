package student.classes;

import student.enums.Gender;

public class Student {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private int money;

    public Student(String name, String surname, int age, Gender gender, int money) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +
                "\n   Name:    " + name +
                "\n      Surname: " + surname +
                "\n         Age:     " + age +
                "\n            Gender:  " + gender +
                "\n               Money:   " + money ;

    }
}
