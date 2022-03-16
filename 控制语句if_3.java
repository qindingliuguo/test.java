import java.util.Scanner;

public class 控制语句if_3 {
    public static void main(String[]args) {
        //创建天气变量
        String Weather;
        //创建性别变量
        String gender;
        //创建温度变量
        int temperature;
        //接收用户输入
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("欢迎使用本系统");
        //接收并存储用户输入
        System.out.print("请输入当前天气:");
        Weather = s.next();
        System.out.print("请输入性别:");
        gender = s.next();
        //判断天气
        if (Weather.equals("阴天")){
            //判断性别
            if (gender.equals("男生")){
                System.out.println("带黑伞");
            }else if (gender.equals("女生")){
                System.out.println("带粉伞");
            }
        }else if (Weather.equals("晴天")){
            System.out.print("当前天气温度:");
            temperature = s.nextInt();
            if (temperature > 30){
                if (gender.equals("男生")){
                    System.out.println("带墨镜");
                }else if (gender.equals("女生")){
                    System.out.println("带太阳帽");
                }
            }else if (temperature < 30){
                System.out.println("穿短袖");
            }
        }
        System.out.println("感谢使用本系统");
    }
}
