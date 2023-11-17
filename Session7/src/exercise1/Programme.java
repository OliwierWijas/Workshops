package exercise1;

import java.io.Serializable;

public class Programme extends Education implements Serializable
{
  private String headOfProgramme;

  public Programme(String code, String title, String headOfProgramme)
  {
    super(code, title);
    this.headOfProgramme = headOfProgramme;
  }

  public String getHeadOfProgramme()
  {
    return headOfProgramme;
  }

  @Override public String toString()
  {
    return "Programme{" + super.toString() + "headOfProgramme='" + headOfProgramme + '\'' + '}';
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    Programme other = (Programme) obj;
    return super.equals(obj) && this.headOfProgramme.equals(other.headOfProgramme);
  }
}
