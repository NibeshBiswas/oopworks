package com.task;

/**
 * Created by sumon on 5/3/17.
 */

 class A {
    int i,j;

    void showij(){
        System.out.println("i & j:"+i +" " +j);

    }
}

class B extends  A{
    int k;

    void showk(){
        System.out.println("k:"+k);
    }
    void sum(){
        System.out.println("i+j+k:"+(i+j+k));

    }

}
public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();
        superOb.i=10;
        superOb.j=20;
        System.out.println("Contents of superobject:");
        superOb.showij();
        System.out.println();

        subOb.i=5;
        subOb.j=20;
        subOb.k=25;

        System.out.println("Contents of subobject:");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("The sum of i,j and k(subob of B)::");
        subOb.sum();



    }






}
