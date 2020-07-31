package ru.synergyIT;

public class Employee {
    private String surname;
    private String name;
    private String secondname;
    private int workAge;

    public Employee() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void printEmployee() {
        System.out.println ( this.getSurname () + " " + this.getName () + " " + this.getSecondname () + " стаж " +
                "работы " + this.getWorkAge () );
    }
}
