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
public class Student extends Person{
    
    private String RegNo;
    private String ProjectSelection;
    
    public void SetReg(String registrationNumber)
    {
        int size= registrationNumber.length();
  boolean flag=false;
  if(size>9&&size<=11)
  { 
      if ( registrationNumber.charAt(0) == '2' &&  registrationNumber.charAt(1) == '0' && ( registrationNumber.charAt(2) >= '0' &&  registrationNumber.charAt(2) <= '9') && ( registrationNumber.charAt(3) >= '0' &&  registrationNumber.charAt(3) <= '9') &&  registrationNumber.charAt(4) == '-' &&  registrationNumber.charAt(5)== 'C' && ( registrationNumber.charAt(6) >= 'A' &&  registrationNumber.charAt(6) <= 'Z') &&  registrationNumber.charAt(7) == '-')
        {
            for (int i = 8; i < size; i++)
            {
                if ( registrationNumber.charAt(i) >= '0' &&  registrationNumber.charAt(i) <= '9')
                {
                    RegNo=registrationNumber;
                    flag = true;
                }
            }
        }
    }
        
    }
    public void SetProject(String s)
    {
        ProjectSelection=s;
    }
    public String getReg()
    {
        return RegNo;
    }
    public String getProject()
    {
        return ProjectSelection;
    }
}
