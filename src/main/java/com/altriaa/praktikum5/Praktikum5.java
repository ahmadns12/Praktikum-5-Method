/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum5;
import java.util.Scanner;
        
/**
 *
 * @author Altriaa
 */
public class Praktikum5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Input the number:");
        int n = sc.nextInt();
        System.out.println("Number of method: 1 to do incrase and -1 to do substraction");
        System.out.println("Input the number of method: ");
        int m = sc.nextInt();
        if(m == 1){
            System.out.println("Number of increase: " + addDigit(n));
        }
        else if(m == -1){
            System.out.println("Number of decrease: " + subDigit(n));
        }
        else{
            System.out.println("Sorry we cant find the number of method");
        }
        
    } 
    
    public static int addDigit(int n){
        int incR = 0;
        while (n != 0){
            incR = incR + n % 10;
            n = n/10;
        }
        return incR;
    }
    
    public static int subDigit(int n){
        int subR = 0;
        while (n != 0){
            subR = -subR - n % 10;
            n = n/10;
        }
        return subR;
    }
    
}
