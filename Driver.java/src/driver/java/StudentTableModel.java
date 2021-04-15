/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class StudentTableModel extends AbstractTableModel{
    private List<Student> li = new ArrayList();
    private String[] columnNames = { "Reg", "Email", "Project", "Name"};

    public StudentTableModel(List<Student> list){
         this.li = list;
    }

    
   
    
    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
  

    @Override     
    public int getRowCount() {
        return li.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getReg();
            case 1:
                return si.getEmail();
            case 2:
                return si.getProject();
            case 3:
                return si.getName();
            case 4:
            //    return "Edit";
            case 5:
                
                 
            //            return "Delete";
            
           }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
       System.out.println("column index = " + columnIndex);
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return String.class;
             case 2:
               return String.class;
             case 3:
               return String.class;
             case 4: 
         //      return String.class;
                case 5: 
         //      return String.class;
             }
             return null;
      }


    
    
}
