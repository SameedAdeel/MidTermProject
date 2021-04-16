/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.java;

/**
 *
 * @author HP
 */
public class Project {
    
    private String ProjectTitle;
    private String ProjectDescription;
    private String ProjectType;
    private Advisor a;
    
    public Project(Advisor a)
    {
        this.a=a;
    }
    public void setTitle(String s)
    {
        ProjectTitle=s;
    }
     public void setDes(String s)
    {
        ProjectDescription=s;
    }
     public void setType(String s)
    {
        ProjectType=s;
    }
      public String getTitle()
    {
        return ProjectTitle;
    }
         public String getDes()
    {
        return ProjectDescription;
    }
      public String getType()
    {
        return ProjectType;
    }
    public Advisor getAdvisor()
    {
        return a;
    } 
}
