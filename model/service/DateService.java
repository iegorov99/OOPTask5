package model.service;

import java.util.Calendar;
import java.util.List;

import model.data.Student;
import model.data.Teacher;
import model.data.User;

public interface DateService<T extends User> {

  Student createStudent(String name, String lastName, Calendar birthDay, String group, String speciality,
      double meanBall);

  Teacher createTeacher(String name, String lastName, Calendar birthDay, String disciplines,
      String department, double rating);

  List<T> readDate();

}
