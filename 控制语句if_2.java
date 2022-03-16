import java.util.Scanner;

public class 控制语句if_2 {
    public static void main(String[]args){
       java.util.Scanner s = new java.util.Scanner(System.in);
       System.out.println("输入年龄");
       int age = s.nextInt();
       System.out.println("age = "+age);
       String ages="少年";
       if (age<0 && age>100){
           System.out.println("输入的年龄不正确，请重新输入");
       }else if (age<=5){
           ages="幼儿";
       }else if (age<=15){
           ages="少年";
       }
       System.out.println(ages);
    }
}
