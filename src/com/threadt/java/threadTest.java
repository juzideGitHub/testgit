package com.threadt.java;

import java.util.ArrayList;
import java.util.Collection;

public class threadTest extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+""+i);
        }
    }
}

class test {
    public static void main(String[] args) {
        new threadTest().run();
        Collection collection = new ArrayList<>();
    }
}
