package com.sumon;

import java.util.*;
//import java.util.Map;
//import java.util.Map.Entry;

/**
 * Created by sumon on 5/3/17.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hm=new HashMap<String,Double>();
        hm.put("Rohit",new Double(1000.00));
        hm.put("Akash",new Double(123.33));
        hm.put("Anisha",new Double(1378.00));

        //get the set of entries

        Set<Map.Entry<String,Double>> set=hm.entrySet();

        //Display the set

        for (Map.Entry<String,Double> me:set) {
            System.out.print(me.getKey() + "=");
            System.out.println(me.getValue());
        }

        System.out.println();

        //Deposit 500 into John Doe account

        double balance=hm.get("Rohit");
        hm.put("Rohit",balance+500);

        System.out.println("Rohit new balance:"+ hm.get("Rohit"));





    }
}
