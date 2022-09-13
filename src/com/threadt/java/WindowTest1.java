package com.threadt.java;

class Window1 extends Thread{

    private static int ticket = 1000;

    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj){
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName()+",票号:"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }

    }
}
public class WindowTest1 {
    public static void main(String[] args) {

        Window1 thread1 = new Window1();
        Window1 thread2 = new Window1();
        Window1 thread3 = new Window1();

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
