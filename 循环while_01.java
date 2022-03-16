public class 循环while_01 {
    public static void main(String[]args){
        int count=0;
        for (int i=2;i<100;i++){
            boolean issushu=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    issushu=false;
                    break;
                }
            }
            if (issushu){
                System.out.print(i+"  ");
                count++;
                if (count ==8){
                    System.out.println();
                    count=0;
                }
            }

        }

    }
}
