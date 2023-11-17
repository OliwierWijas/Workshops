package exercise1;

import java.io.Serializable;

public class School extends Education implements Serializable
{
  private String type;
  public final static String INFANT_SCHOOL = "Infant school";
  public final static String JUNIOR_SCHOOL = "Junior school";
  public final static String SECONDARY_SCHOOL = "Secondary school";
  public final static String HIGH_SCHOOL = "High school";

  public School(String code, String title, String type)
  {
    super(code, title);
    this.type = type;
  }

  public String getSchoolType()
  {
    return type;
  }

  @Override public String toString()
  {
    return "School{" + super.toString() + "type='" + type + '\'' + '}';
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    School other = (School) obj;
    return super.equals(other) && this.type.equals(other.type);
  }
}
