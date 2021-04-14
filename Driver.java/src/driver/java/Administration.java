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
    
    private Administration(){
        ad=new ArrayList<Advisor>();
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

}
