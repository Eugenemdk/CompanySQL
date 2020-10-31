package worker;

import person.Person;

public class Worker extends Person {
private double salary;
private String department;
private String speciality;
private int experience;
    public Worker(int age, String name, String surname, double height) {
        super(age, name, surname);
    }

    public Worker(int age, String name, String surname, double salary, String department, String speciality, int experience) {
        super(age, name, surname);
        this.salary = salary;
        this.department = department;
        this.speciality = speciality;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
