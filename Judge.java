import java.util.Scanner;
public class Judge{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入整數: ");
        int a = input.nextInt();
        while(a > 0){
            System.out.println("大於0");
            break;
        }
        while(a == 0){
            System.out.println("等於0");
            break;
        }
        while(a < 0){
            System.out.println("小於0");
            break;
        }
    }
}
