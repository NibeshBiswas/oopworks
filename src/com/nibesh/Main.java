package com.nibesh;

import java.util.Scanner;

/**
 * Created by nibesh on 5/3/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter the nbr1= ");
        double n1=obj1.nextDouble();
        System.out.println("enter the nbr2= ");
        double n2=obj1.nextDouble();

        Operation ot=new Operation();
        ot.Add(n1,n2);
        ot.Subtract(n1,n2);

    }
}
