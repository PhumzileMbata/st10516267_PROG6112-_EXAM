/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matresssales;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class MatressSales {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[]products={"Cozy Nights Mornarch matress","Restonic Barbados matress","Sealy Phuket matress"}
                
       int[][]sales =new int[3][3];
        
        for(int p =0;p <3;p++){
        for(int m =0;m <3;m++){
            System.out.println("Enter number of sales for month"+ (m+1) "for" +products[p]+"matress");
            sales[p][m]= input.nextInt();
        }
            System.out.println();  
        } 
        int[]productTotals=new int[3];
        int total =0;
        for(int p =0;p<3;p++){
                              for(int m =0;m<3;m++){
                          }               
        }
        int m = 0;
        int p = 0;
        productTotals[p]= productTotals[p]+sales[p][m];
    }
     int average =total/9;          
        int best=0;
    private int total;
        for(int p=1;p<3;p++);
        if(productTotals[p]>productTotals[best]){
            best=p;
        }
    }
    System.out.println("PRODUCTS SALES REPORT - 2026");
     System.out.println("*********************************************");
      System.out.println("TOTAL PRODUCT SALES: "+total);
       System.out.println("AVERAGE PRODUCT SALES: "+average);
     System.out.println("MOST POPULAR PRODUCT: "+products[best]+"("+productTotal{best+")");
}


