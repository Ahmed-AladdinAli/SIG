/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Date; 
/**
 *
 
 */
public class Header {
    private int serialNumber  ; 
    private Date date; 
    private String name; 
    private ArrayList <Line> lines;


    public ArrayList <Line> getLines() {
        return lines;
    }

    public Header(int serialNumber, Date date, String name) {
        this.serialNumber++;
        this.date = date;
        this.name = name;
    }
    public double getTotal(){
        double total = 0.0;
        for (int i = 0 ; i< lines.size();i++){
        Line line = lines.get(i);
        total += line.totalPrice();
        
        }
        return total;
         }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDigit() {
        return serialNumber;
    }

    public void setDigit(int digit) {
        this.serialNumber = digit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Header{" + "digit=" + serialNumber + ", date=" + date + ", name=" + name + '}';
    }


    
  
}
