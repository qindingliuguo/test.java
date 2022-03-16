import java.util.Scanner;

public class switch简易计算器 {
    public static void main(String[]args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        int a,c,sum;
        String b;
        a=s.nextInt();
        b=s.next();
        c=s.nextInt();
            switch (b){
                case "+":
                    sum=a+c;
                    System.out.println(sum);
                    break;
                case "-":
                    sum=a-c;
                    System.out.println(sum);
                    break;
                case "*":
                    sum=a*c;
                    System.out.println(sum);
                    break;
                case "/":
                    sum=a/c;
                    System.out.println(sum);
                    break;
            }

    }
}
