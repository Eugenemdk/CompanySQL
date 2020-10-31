package chief;

import person.Person;

public class Chief extends Person {
private double salary;
private int experience;
private String department;
    public Chief(int age, String name, String surname, double height) {
        super(age, name, surname);
    }

    public Chief(int age, String name, String surname, double height, double salary, int experience, String department) {
        super(age, name, surname);
        this.salary = salary;
        this.experience = experience;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
