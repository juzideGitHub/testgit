import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//
//        try {
//            System.out.println(num1/num2);
//
//        }catch (ArithmeticException a){
//            System.out.println("不为零");
//        }finally {
//            System.out.println("结束");
//        }

        String s0 = "0";
        String s1 = "1";
        if (s0.equals(s1)){
            System.out.println("equals");
        }

        Object o0 = new Object();
        Object o1 = new Object();
        if (o0.equals(o1)){
            System.out.println("obj");
        }
    }


}
