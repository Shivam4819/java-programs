/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class GeneralQuestion {
    
        Scanner s =new Scanner(System.in);
    private int arr[]= new int[10];
    private int num,fact,flag,result,a,num1;
    
    public void armstrong(){
        result=0;
        num1=0;
        System.out.println("enter the number-");
        num=s.nextInt();
        num1=num;
        while(num>0){
             a=num%10;
             result=result+(a*a*a);
             num=num/10;
        }
        if(num1==result)
            System.out.println(num1+" is armstrong number");
        else
            System.out.println(num1+" is not an armstrong number");
    }
    
    public void findfactorial(){
        System.out.println("enter number-");
        num = s.nextInt();
        fact =1;
        
            for(int i=1;i<=num;i++){
                fact =fact*i;
            }
        
        System.out.println("factorial->"+fact);
    }
     
    public void fibonacci(){
        
        System.out.println("enter the number");
        arr[0]=0;
        arr[1]=1;
            for (int i = 2; i < num; i++) {
                arr[i] = arr[i-1]+arr[i-2];
            }
        System.out.println("the series is");
            for (int i = 0; i < num; i++) {
                System.out.println(i+":"+arr[i]);
            }
    }
     
    public void palindrome(){

        result=0;
        num1=0;
        System.out.println("enter the number-");
         num=s.nextInt();
         num1=num;
         while(num>0){
             a=num%10;
             result=(result*10)+a;
             num=num/10;
         }
         if(num1==result){
             System.out.println(num1+" is palindrome ");
         }
         else
             System.out.println(num1+" is not palindrome");
    } 
    
    
    public void primenumber(){
         flag=0;
        System.out.println("enter the number-");
        num = s.nextInt();
        for(int i=1; i<=num;i++){
        if(num%i ==0){
            flag++;
        }
        }
        if(flag==2){
             System.out.println("prime number");
        }
        else{
             System.out.println("not prime");
        }
    }
}
