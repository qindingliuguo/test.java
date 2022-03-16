public class 控制语句if {
    public static void main(String[]args){
        double a=90;
        if (a<0 || a>100){
            System.out.println("请输入正确的成绩");
        }else if (a>=90 && a<=100){
            System.out.println('A');
        }else if (a>=80 && a<=90){
            System.out.println('B');
        }else if (a>=70 && a<=80){
            System.out.println('C');
        }



    }
}
