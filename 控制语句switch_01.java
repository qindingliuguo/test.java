public class 控制语句switch_01 {
    public static void main(String[]args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        double grades;
        int num;
        grades = s.nextDouble();
        num =(int) (grades / 10);
        switch (num){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
        }
    }
}
