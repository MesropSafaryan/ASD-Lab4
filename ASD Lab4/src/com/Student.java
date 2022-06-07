package com;

public class Student {
    private String name;
    private String surname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    public Student(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
    public int GetMonthOfBirth() {
        return monthOfBirth;
    }
    public String toString() {
        return "Студент: { ім'я: "+ name + "; прізвище: "+ surname + "; день народження: "+ dayOfBirth +
                "; місяць народження: "+ monthOfBirth + "; рік народження: "+ yearOfBirth +"}";
    }
}
