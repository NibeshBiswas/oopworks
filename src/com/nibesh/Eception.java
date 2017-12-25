package com.nibesh;

import java.util.Scanner;

/**
 * Created by nibesh on 5/3/17.
 */
public class Eception {
    public static void main(String[] args) {

        Scanner obj1=new Scanner(System.in);
        System.out.println("enter nbr1= ");
        int n1=obj1.nextInt();
        System.out.println("enter nbr2= ");
        int n2=obj1.nextInt();

        try{
            int result=n1/n2;
            System.out.println("result= "+result);
            //System.out.println("Inside try blok");
        }
        catch (java.lang.Exception e) {
            System.out.println("exception found");
        }
        finally {
            System.out.println("Inside finally blok");

        }
    }
}
