package exercise1;

import java.io.*;
import java.util.ArrayList;

public class FileReader
{
  private String filePath;

  public FileReader(String filePath) throws FileNotFoundException
  {
    this.filePath = filePath;
  }

  public Student[] readStudents() throws IOException
  {
    ArrayList<Student> temp = new ArrayList<>();

    try (ObjectInputStream read = new ObjectInputStream(new FileInputStream(filePath)))
    {
      while (true)
      {
        try
        {
          Student student = (Student) read.readObject();
          if (student != null)
            temp.add(student);
        }
        catch (EOFException e)
        {
          break;
        }
        catch (ClassNotFoundException e)
        {
          throw new RuntimeException(e);
        }
      }
    }
    catch (EOFException e) {}

    Student[] students = new Student[temp.size()];
    for (int i = 0; i < temp.size(); i++)
    {
      students[i] = temp.get(i);
    }
    return students;
  }

  public void writeStudents(Student[] students) throws IOException
  {
    try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(filePath)))
    {
      for (Student student : students)
      {
        if (student != null)
          write.writeObject(student);
      }
    }
  }
}
