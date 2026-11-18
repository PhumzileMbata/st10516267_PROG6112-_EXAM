/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
public class PrintProduct {
    private IProduct product;
    
    public PrintProduct(IProduct product){
        this product = product;
    }
   public void PrintTotalProductSales(){
       System.out.println("TOTAL PRODUCT SALES: "+product.GetTotalProductsSold());  
   }
   public void PrintAverageProductSales(){
       System.out.println("AVERAGE PRODUCTS SALES: "+Math.round(product.GetAverageProductSold));
   }
   public void PrintMostPopularProduct(){
       System.out.println("MOST POPULAR PRODUCT: "+product.GetMostPopularProduct());
       
   }
}
