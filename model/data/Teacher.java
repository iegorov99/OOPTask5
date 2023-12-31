package model.data;

import java.util.Calendar;

public class Teacher extends User {

  private static int teacherId = 1;
  private String disciplines;
  private String department;
  private double rating;

  public Teacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating) {
    super(name, lastName, birthDay);
    this.teacherId = teacherId + 1;
    this.disciplines = disciplines;
    this.department = department;
    this.rating = rating;
  }

  public String getDisciplines() {
    return disciplines;
  }

  public void setDisciplines(String disciplines) {
    this.disciplines = disciplines;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public static int getStudentId() {
    return teacherId;
  }

  public static void setStudentId(int teacherId) {
    Teacher.teacherId = teacherId;
  }

  @Override
  public String toString() {
    return "Преподаватель: Фамилия - " + getLastName() + ", Имя - " + getName() + ", Кафедра - " + getDepartment()
        + ", Рейтинг - " + getRating() + ", Дисциплины - " + getDisciplines();
  }

}