import java.io.IOException;
import java.util.Scanner;

public class 字符编码 {
    public static void main(String[]args) {
        int a=10;
        int b=010;
        int c=0x10;
        long d=456;
        long e=2147483647;
        long f=2147483848L;
        int x=(int)f;
        byte m=50;
        char u=97;
        System.out.println(u);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(x);
        System.out.println(m);
        boolean p=true;
        boolean l=false;
        System.out.println("b is " + p);
        System.out.println("b is " + l);
        if (l){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }
}
