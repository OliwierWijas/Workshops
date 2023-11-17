package exercise1;

import java.io.*;
import java.util.ArrayList;

public class StudentList implements Serializable
{
  private int size;
  private Student[] students;
  private FileReader fileReader;

  public StudentList() throws FileNotFoundException
  {
    this.size = 0;
    this.students = new Student[size];
    this.fileReader = new FileReader("file.bin");
  }

  public void addStudent(Student student) throws IOException
  {
    students = fileReader.readStudents();
    size = students.length;

    if (students.length >= size)
    {
      doubleTheListCapacity();
    }
    this.students[size] = student;
    fileReader.writeStudents(students);
  }

  public void removeStudent(Student student) throws IOException
  {
    students = fileReader.readStudents();
    size = students.length;

    for (int i = 0; i < students.length; i++)
    {
      if (students[i] != null && students[i].equals(student))
      {
        for (int j = i; j < students.length - 1; j++)
        {
          students[j] = students[j+1];
        }
        students[size-1] = null;
      }
      break;
    }
    fileReader.writeStudents(students);
  }

  public Student getStudent(int index) throws IOException
  {
    students = fileReader.readStudents();
    size = students.length;

    if (index >= size)
    {
      System.out.println("Index out of bounds.");
      return null;
    }
    else
    {
      return students[index];
    }
  }

  public Student[] getICTEngineeringStudents() throws IOException
  {
    students = fileReader.readStudents();
    size = students.length;

    ArrayList<Student> temporaryArrayList = new ArrayList<>();

    for (int i = 0; i < size; i++)
    {
      if (students[i].getEducation().getTitle().equals("ICTEngineering"))
        temporaryArrayList.add(students[i]);
    }

    Student[] ICTStudents = new Student[temporaryArrayList.size()];

    for (int i = 0; i < temporaryArrayList.size(); i++)
    {
      ICTStudents[i] = temporaryArrayList.get(i);
    }
    return ICTStudents;
  }

  private void doubleTheListCapacity()
  {
    if (size == 0)
    {
      size++;
      students = new Student[size];
    }
    else
    {
      this.size = 2*size;
      Student[] temp = students;
      students = new Student[size];
      for (int i = 0; i < temp.length; i++)
      {
        students[i] = temp[i];
      }
    }
  }
}
