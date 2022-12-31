/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import View.SalesInvoiceFrame;

import javax.swing.JFrame;
import javax.swing.JTable;



 public  class HTable extends JFrame {
    
    private JTable HTable; 
    private String[] columns = {"No.", "Date", "Customer","Total"};
    private int serialNumber;


     
    
    private String[][]data ={};
    
    
    
     
    public HTable (){
        super(); 
        
    HTable = new JTable (data , columns);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
   
}
