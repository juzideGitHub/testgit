package com.threadt.test;

public class TryTest {
    public static void main(String[] args) {

        System.out.println(1);
        try {
            test(0.0);
        } catch (Exception e) {
//        } catch (IllegalArgumentException e) {
//        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println(3);
    }
    public static void test(double p) {
        if (p <= 0.0) {
            throw new IllegalArgumentException("必须大于0");
        }
        System.out.println(2);
    }
}
