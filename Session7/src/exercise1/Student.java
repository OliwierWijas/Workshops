package exercise1;

import java.io.Serializable;

public class Student implements Serializable
{
  private String name;
  private Education education;

  public Student(String name, Education education)
  {
    this.name = name;
    this.education = education;
  }

  public String getName()
  {
    return name;
  }

  public Education getEducation()
  {
    return education;
  }

  @Override public String toString()
  {
    return "Student{" + "name='" + name + '\'' + ", education=" + education
        + '}';
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    Student other = (Student) obj;
    return this.name.equals(other.name) && this.education.equals(other.education);
  }
}
