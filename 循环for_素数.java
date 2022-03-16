public class 循环for_素数 {
    public static void main(String[]args){
        int j, a=0;
        for (int i=2;i<1000;i++){
            for (j=2;j<i;j++){
                if (i%j==0){
                    break;
                }
            }
            if (j>=i){
                System.out.print("  "+i+"  ");
                a++;
                if (a%4==0){
                    System.out.println();
                }
            }
        }
    }
}
