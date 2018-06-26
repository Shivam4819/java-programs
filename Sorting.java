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
public class Sorting {
     private int arr[] = new int[10];
    private int temp,n,j,key,min,i;
    Scanner sc = new Scanner(System.in);
    public void bubblesort(){
        
        System.out.println("enter total nuber of data");
        n=sc.nextInt();
        
        System.out.println("enter the data-");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for (int i=0;i<n;i++)
            for (int j=0;j<5-i-1;j++)
                if (arr[j] > arr[j+1])
                {
                    
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        for (int i=0; i<n; ++i){
        System.out.print(arr[i] + " ");
        }
    }
    
    public void insertionsort(){
        
        System.out.println("enter total nuber of data");
        n=sc.nextInt();
        
        System.out.println("enter the data-");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for (int i=1;i<n;i++){
            
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key){
                    
                    arr[j+1] = arr[j];
                    j--;
            }
            arr[j+1]=key;
        }
        for (int i=0; i<n; ++i){
        System.out.print(arr[i] + " ");
        }
    }
    
     public void selectionsort(){
        System.out.println("enter the size of array-");
        n=sc.nextInt();
        System.out.println("enter the data of array-");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        while(n>0){
        min=arr[0];
        for (i = 0; i < n; i++) {
            
             if(min>arr[i]){
                min=arr[i];
                j=i;
             }
        }
             temp = min;
             min= arr[i];
             arr[i]=temp;
        n--;
        }
        for( i=0;i<n;i++){
            System.out.println(arr[i]);   
        }
        
    }
}
