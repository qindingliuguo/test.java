public class Vartest {
    public static void main(String[]args){
        //声明一个int类型的变量起名为i
        int i;
        //将i的值赋值为100
        i = 100;
        System.out.println(i);
        //i再次重新赋值
        i = 200;
        System.out.println(i);
        //一行上可以声明多个变量
        int a,b,c;
        Vartest02 vartest1 = new Vartest02(3);
        System.out.println(vartest1.i);
        Vartest02 vartest2 = new Vartest02(1);
        System.out.println(vartest2.i);
    }


}
