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
public class Advisor extends Person {
    private String CNIC;
    private String Degree;
    
    public void setCNIC(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                CNIC=s;
            }
        }
    }
    public void setDegree(String s)
    {
            if(s.charAt(0)=='C' && s.charAt(1)=='S')
            {
                Degree=s;
            }   
    }
    public String getCNIC()
    {
      return CNIC;

    }
    public String getDegree()
    {
      return Degree;

    }
}
