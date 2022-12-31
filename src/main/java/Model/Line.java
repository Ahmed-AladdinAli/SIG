/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *

 */
public class Line {

    private String NameItem; 
    private int count ; 
    private double price; 
     private Header invoice ; 

    public Line(String NameItem, int count, double price, Header invoice) {
        this.NameItem = NameItem;
        this.count = count;
        this.price = price;
        this.invoice = invoice;
    }

    public double totalPrice(){
    return  count*price ;
            }
    public Header getInvoice() {
        return invoice;
    }

    @Override
    public String toString() {
        return "Line{" + "NameItem=" + NameItem + ", count=" + count + ", price=" + price + '}';
    }

    public void setInvoice(Header invoice) {
        this.invoice = invoice;
    }

    public String getNameItem() {
        return NameItem;
    }

    public void setNameItem(String NameItem) {
        this.NameItem = NameItem;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
