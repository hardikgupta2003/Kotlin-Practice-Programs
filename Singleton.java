package com.example.kotlincodes;

public class Singleton{
    private static Singleton INSTANCE;
    private Singleton(){}
    public static Singleton getInstance(){
        if (INSTANCE == null) {                // Single Checked
            synchronized (Singleton.class) {
                if (INSTANCE == null) {        // Double checked
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
    private int count = 0;
    public int count(){ return count++; }
}


