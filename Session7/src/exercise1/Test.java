package exercise1;

import java.io.IOException;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    StudentList studentList = new StudentList();
    Education education = new Programme("STE", "Software Technology Engineering", "Allan Henriksen");
    Student student = new Student("oliwier", education);
    studentList.addStudent(student);
    System.out.println(studentList.getStudent(0));
    studentList.removeStudent(student);
    System.out.println(studentList.getStudent(0));
  }
}
