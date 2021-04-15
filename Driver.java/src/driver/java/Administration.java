/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.java;
import java.util.*;
/**
 *
 * @author HP
 */
public class Administration {
    
    private static Administration instance;
    
    private List<Advisor> ad ;
    private List<Student> st;
    
    private Administration(){
        ad=new ArrayList<Advisor>();
        st=new ArrayList<Student>();
    }
    public static Administration getIsntance(){
        if(instance==null)
        {
            instance = new Administration();
        }
        
        return instance;
    }
    
    public void AddAdvisor(Advisor a)
    {
        ad.add(a);
    }
    private int searchAdvisor(String email)
    {
        int index = -1;
         for(int i = 0 ; i  < ad.size(); i++)
         {
             if(ad.get(i).getEmail().equals(email))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
    public boolean deleteAdvisor(String email){
       int index = searchAdvisor(email);
       
       if(index == -1)
           return false;
       else {
           ad.remove(index);
           return true;
       }
    }
    public List<Advisor> getAllAdvisor()
    {
        return ad;
    }
    
    public void AddStudent(Student stu)
    {
        st.add(stu);
    }
    
     private int searchStudent(String reg)
    {
        int index = -1;
         for(int i = 0 ; i  < st.size(); i++)
         {
             if(st.get(i).getReg().equals(reg))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
     public boolean deleteStudent(String reg){
       int index = searchStudent(reg);
       
       if(index == -1)
           return false;
       else {
           st.remove(index);
           return true;
       }
    }
    public boolean UpdateStudent(String reg,String proj,String name,String email)
    {
        int index = searchStudent(reg);
       
       if(index == -1)
           return false;
       else {
           st.get(index).SetProject(proj);
           st.get(index).setEmail(email);
           st.get(index).setName(name);
           return true;
       }
    }
    public List<Student> getStudents()
    {
        return st;
    }
}
