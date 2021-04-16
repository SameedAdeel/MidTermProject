/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.java;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author HP
 */
public class Administration {
    
    private static Administration instance;
    private int a=1;
    private List<Advisor> ad ;
    private List<Student> st;
    private List<Project> pro;
    
    private Administration(){
        ad=new ArrayList<Advisor>();
        st=new ArrayList<Student>();
        pro=new ArrayList<Project>();
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
     public void AddProject(Project p)
    {
        pro.add(p);
    }
    
     private int searchProject(String title)
    {
        int index = -1;
         for(int i = 0 ; i  < pro.size(); i++)
         {
             if(pro.get(i).getTitle().equals(title))
             {
                 index = i;
                 break;
             }
         }
         
        return index;
    }
     public boolean deleteProject(String t){
       int index = searchProject(t);
       
       if(index == -1)
           return false;
       else {
           pro.remove(index);
           return true;
       }
    }
    public boolean UpdateProject(String title,String des,String type)
    {
        int index = searchStudent(title);
       
       if(index == -1)
           return false;
       else {
           pro.get(index).setDes(des);
           pro.get(index).setType(type);
           return true;
       }
    }
    public List<Project> getProjects()
    {
        return pro;
    }
    
    
    public void ViewProject()
    {
        for(int i=0;i<pro.size();i++)
        {
            JOptionPane.showMessageDialog(null,"Select the following projects :\n "+pro.get(i).getTitle());
            
        }
    } 
    
    public void Save()
    {
        try{
            FileWriter fw =new FileWriter("Student.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0;i<pro.size();i++)
            {
                fw.write("Group: "+(a++) + "\t\tAdvisor : "+ pro.get(i).getAdvisor().getName()+"\n");
                for(int j=0;j<st.size();j++)
                {
                    if(st.get(j).getProject().equals(pro.get(i).getTitle()))
                    {
                        fw.write(st.get(j).getReg());
                    }
                }   
            }
        }
        catch(Exception ex)
        {
            
        }
    }
    public void SaveData()
    {
        try{
            FileWriter fw =new FileWriter("Student.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i=0;i<pro.size();i++)
            {
                fw.write("Group: "+(a++) + "\t\tAdvisor : "+ pro.get(i).getAdvisor().getName()+"\n");
                for(int j=0;j<st.size();j++)
                {
                    if(st.get(j).getProject().equals(pro.get(i).getTitle()))
                    {
                        fw.write(st.get(j).getReg());
                    }
                }   
            }
        }
        catch(Exception ex)
        {
            
        }
    }
        
}
