/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import sorting.*;
/**
 *
 * @author shivam
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Array a=new Array();
       a.findmax();
       a.findmin();
       a.duplicate();
       a.addmatrix();
       a.transposeMatrix();
       a.oddoreven();
       
       GeneralQuestion g =new GeneralQuestion();
       g.armstrong();
       g.fibonacci();
       g.findfactorial();
       g.palindrome();
       g.primenumber();
       
       Sorting s =new Sorting();
       s.bubblesort();
       s.insertionsort();
       s.selectionsort();
       
       Searching se = new Searching();
       se.binarySearch();
       se.linearSearch();
       
       
        // TODO code application logic here
    }
    
}
