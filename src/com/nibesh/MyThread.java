package com.nibesh;

/**
 * Created by nibesh on 5/3/17.
 */
public class MyThread extends Thread{
    MyThread(String name){
        this.setName(name);
    }
    synchronized public void run(){

        for (int i=0;i<10;i++) {
            System.out.println("value of i in " + this.getName());
            try {
                MyThread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
