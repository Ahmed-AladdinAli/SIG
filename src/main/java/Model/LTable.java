/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.*;

/**
 *
 * @author ahmed elhwash
 */
public class LTable extends JFrame  {
    
     private JTable LTable; 
    private String[] columns = {"No.", "ItemName", "Item Price","Count","Item Total"};
    private String[][]data ={};
    
    
    
    
    
    
    
    
    public LTable (){
        super(); 
    LTable = new JTable (data , columns); 
    setSize (400, 500); 
    setLocation(200, 200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
   
    
}
