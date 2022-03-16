public class 循环for_九九乘法表 {
    public static void main(String[]args){
        for (int i=1;i<=9;i++){         //乘号左数
            for (int j=1;j<=i;j++){     //乘号右数
                System.out.print(j+"*"+i+"="+j*i+"   ");
            }
            System.out.print("\n");
        }
    }
}
