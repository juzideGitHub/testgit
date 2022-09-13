package com.threadt.java;


class Window implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this){

                if (ticket < 99) {
                    notify();
                }

                if (ticket > 0){
                    if (ticket % 2 == 0) {
//                        try {
//                            wait();
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
                    }
                    System.out.println(Thread.currentThread().getName()+",票号:"+ticket);
                    ticket--;
                    try {
                            wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                }else {
                    break;
                }
            }
        }

    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window w = new Window();

        System.out.println(Thread.currentThread().getName());

        Thread thread1 = new Thread(w);
        Thread thread2 = new Thread(w);
        Thread thread3 = new Thread(w);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
