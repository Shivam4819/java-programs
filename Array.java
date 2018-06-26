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
public class Array {
    Scanner s = new Scanner(System.in);
    private int arr[] =new int[10];
    private int mat1[][] =new int[3][3];
    private int mat2[][] =new int[3][3];
    private int result[][] =new int[3][3];
    private int arr1[] =new int[10];
    private int arr2[] =new int[10];
    private int max,min,n,r,j,i,flag;
    
    public void findmax(){
        System.out.println("enter the size of array-");
        n=s.nextInt();
        System.out.println("enter the data of array-");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the place whose maximum you want to know");
        r=s.nextInt();
        
        
        while(r>0){
        max=arr[0];
        for (i = 0; i < n; i++) {
            
             if(max<arr[i]){
                max=arr[i];
                j=i;
             }
        }
        arr[j]=-1;
        r--;
        }
        System.out.println("max is"+max);
        
    }
    
    public void findmin(){
        System.out.println("enter the size of array-");
        n=s.nextInt();
        System.out.println("enter the data of array-");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter the place whose minimum you want to know");
        r=s.nextInt();
        
        
        while(r>0){
        min=arr[0];
        for (i = 0; i < n; i++) {
            
             if(min>arr[i]){
                min=arr[i];
                j=i;
             }
        }
        arr[j]=Integer.MAX_VALUE;
        r--;
        }
        System.out.println("min is"+min);
        
    }
    
    public void duplicate(){
        System.out.println("enter the size of array-");
        n=s.nextInt();
        System.out.println("enter the data of array-");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        min=arr[0];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]!=arr[j]){
                flag=1;
                System.out.println("flag==1");
                }
                else{
                    System.out.println("yo");
                    flag=0;
                }
            }
            if(flag==1){
                arr1[i]=arr[i];
            }
            flag=0;
        }
        
        System.out.println("array is -");
        for(i=0;i<n;i++){
            System.out.println(arr1[i]);
        }
        
    }
        
    public void addmatrix(){
        System.out.println("enter 1st matrix[3][3]");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                mat1[i][j]=s.nextInt();
        }
        
        System.out.println("enter 2nd matrix[3][3]");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                mat2[i][j]=s.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        
        System.out.println("1st matrix-");
        for(i=0;i<3;i++){
            System.out.println();
            for(j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.println("2nd matrix-");
        for(i=0;i<3;i++){
            System.out.println();
            for(j=0;j<3;j++){
                System.out.print(mat2[i][j]+" ");
            }
        }
        System.out.println("Result-");
        for(i=0;i<3;i++){
            System.out.println();
            for(j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
        }
        
    }
    
     
    public void oddoreven(){
        int j=0,z=0;
        System.out.println("enter size of array:-");
        n=s.nextInt();
        System.out.println("enter data");
        for(i=0;i<n;i++){
            arr[i] = s.nextInt();
        }    
        for(i=0;i<n;i++){
            if(arr[i]%2==0){
                arr1[j]=arr[i];
                j++;
            }
            else{
                arr2[z]=arr[i];
                z++;
            }
        }
        System.out.println("Even number:-");
        for(i=0;i<j;i++)
            System.out.println(arr1[i]);
        
        System.out.println("Odd number:-");
        for(i=0;i<z;i++)
            System.out.println(arr2[i]);
    }
    
    public void transposeMatrix(){
        
        System.out.println("Enter matrix[3][3]:-");
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                mat1[i][j]=s.nextInt();
        }
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                result[i][j]=mat1[j][i];
            }
        }
        
        System.out.println("Matrix:-");
        for(i=0;i<3;i++){
            System.out.println();
            for(j=0;j<3;j++){
                System.out.print(mat1[i][j]+" ");
            }
        }
        System.out.println("Transpose:-");
        for(i=0;i<3;i++){
            System.out.println();
            for(j=0;j<3;j++){
                System.out.print(result[i][j]+" ");
            }
        }
    }
}
