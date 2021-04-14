/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class AdvisorTableModel extends AbstractTableModel {
    private List<Advisor> li = new ArrayList();
    private String[] columnNames = { "Name", "Email", "CNIC", "Degree"};

    public AdvisorTableModel(List<Advisor> list){
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
        Advisor si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getName();
            case 1:
                return si.getEmail();
            case 2:
                return si.getCNIC();
            case 3:
                return si.getDegree();
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
