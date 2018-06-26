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
public class Searching {
    
    private int arr[] = new int[10];
    private int num,temp,n,left,right,mid;;
    Scanner s = new Scanner(System.in);
    
    public void linearSearch(){
        System.out.println("enter length of array:-");
        n=s.nextInt();
        System.out.println("enter data");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        System.out.println("Enter the element to search:-");
        num = s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==num)
                System.out.println("number found ");
        }
    }
    
    public void binarySearch(){
        
        System.out.println("enter length of array:-");
        n=s.nextInt();
        System.out.println("enter data");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        
        System.out.println("enter the element to search:-");
        num = s.nextInt();
        left=0;
        right=n;
        while(left<=right){
            mid = left+(right-left)/2;
            
            if(arr[mid]==num){
                mid =mid+1;
                System.out.println("element founded");
                return;
            }
            else if(arr[mid]<num){
                left=mid+1;
            }
            else
                right=mid-1;
        }
    }
}
