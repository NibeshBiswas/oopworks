package com.sumon;
import java.util.*;

/**
 * Created by sumon on 5/3/17.
 */
public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        System.out.println("Initial size of arraylist:"+arrayList.size());

        //add elements

        arrayList.add("c");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1,"A2");

        System.out.println("Size of array after additions:"+arrayList.size());

        //Display

        System.out.println("Contents of arrayList:"+arrayList);

        //Remove

        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Size of array after deletions:"+arrayList.size());

        System.out.println("Contents of arraylist:"+arrayList);



    }



}
