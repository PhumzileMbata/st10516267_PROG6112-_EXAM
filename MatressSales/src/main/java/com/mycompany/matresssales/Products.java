/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
public class Products {
    public interface IProduct{
        int GetTotalProductSold();
        double GetAverageProduct();
        String GetMostPopularProducts();
    }
}
public class Product implements IProduct{
    private String[]products;
    private int[]sales;
    
    public Product(String[]products,int[][]sales){
        this.products=products;
         this.sales=sales;    
    }
   public int GetTotalProductSold(){
       int total=0;
       for(int p =0;p <sales.length;p++){
           for(int m=0;<sales[p].length;m++){
           total = total+sales[p][m];
       }
       }
       return total;
   }
   public double GetAverageProduct(){
       int count=0;
       for(int p =0;p<sales.length;p++){
          int count = count+sales[p].length;
       }
       return (double)GetTotalProductSold()/count;
   }
   public String GetMostPopularProducts(){
       int best =0;
       int bestTotal =0;
       
      for(int p=0;p<sales.length;p++){
        for(int m = 0);m <sales[p].length;m++){
         productTotal= productTotal +sales[p][m]; 
      }
        if(productTotal>bestTotal){
            bestTotal=productTotal;
        }
      }
      return product[best]+"("+bestTotal+")";
   }
}