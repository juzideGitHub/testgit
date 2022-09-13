package com.threadt.test;

public class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("thread");
    }
}

class TTest{
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

    }

}
