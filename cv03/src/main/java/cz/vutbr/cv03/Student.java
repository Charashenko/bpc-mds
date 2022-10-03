package cz.vutbr.cv03;


public class Student {
private String name;
private String surname;
private int id;
private int year;

    public Student(String surname,String name,  int id, int year) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.year = year;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Student: <b>%s %s</b> ID: <b>%d</b>", name, surname, id);
    }
}
