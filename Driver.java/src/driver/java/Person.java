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
public class Person {
    
    private String name;
    private String email;
    
    
    public void setName(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if( s.charAt(i)>='A'  && s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z'|| s.charAt(i)==' ')
            {
                name=s;
            }
        }
    }
    
    public void setEmail(String s)
    {
        boolean flag=false;
        int i=0;
        while(s.charAt(i) != '@' && i<50)
        {
            if(s.charAt(i)>='A'  && s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
            i++;
        }
        if(flag==false)
        {
            if(s.charAt(i) == '@')
            {
                flag=true;
                i++;
            }
        }
        while(s.charAt(i) !='.' && i<50)
        {
            if(s.charAt(i)>='A'  && s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                flag=true;
            }
            else
            {
                flag=false;
            }
            i++;
        }
        if(flag==false)
        {
            if(s.charAt(i)=='.')
            {
                flag=true;
                i++;
            }
        }
        if(flag==true)
        {
            email=s;
        }
    }
    public String getEmail()
    {
      return email;
    }
    
    public String getName()
    {
      return name;

    }
    
}
