package exercise1;

import java.io.IOException;

public class Test
{
  public static void main(String[] args) throws IOException
  {
    StudentList studentList = new StudentList();
    Education education = new Programme("STE", "Software Technology Engineering", "Allan Henriksen");
    Student student = new Student("oliwier", education);
    Education education1 = new Programme("ICT", "ICTEngineering", "Allan Henriksen");
    Student student1 = new Student("dominika", education1);
    studentList.addStudent(student);
    studentList.addStudent(student1);
    studentList.removeStudent(student);
    Student[] ICTstudents = studentList.getICTEngineeringStudents();
    for (int i = 0; i < ICTstudents.length; i++)
    {
      System.out.println(ICTstudents[i]);
    }
  }
}
