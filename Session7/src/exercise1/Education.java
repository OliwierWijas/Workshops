package exercise1;

import java.io.Serializable;

public abstract class Education implements Serializable
{
  private String code;
  private String title;

  public Education(String code, String title)
  {
    this.code = code;
    this.title = title;
  }

  public String getCode()
  {
    return code;
  }

  public String getTitle()
  {
    return title;
  }

  @Override public String toString()
  {
    return "Education{" + "code='" + code + '\'' + ", title='" + title + '\''
        + '}';
  }

  @Override public boolean equals(Object obj)
  {
    if (obj == null || obj.getClass() != getClass())
      return false;

    Education other = (Education) obj;
    return this.code.equals(other.code) && this.title.equals(other.title);
  }
}
