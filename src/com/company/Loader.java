package com.company;

import java.util.Random;

public class Loader implements Runnable {
    int time;
    String name;
    Random random = new Random();

    public Loader(String name){
        this.name = name;
        time = random.nextInt(999);
    }

    public void run() {
        System.out.printf("%s спит %d мс \n", name, time);
        try{
            Thread.sleep(time);
        }catch (Exception e){}
        System.out.printf("%s спит и закончился \n", name);
    }
}
