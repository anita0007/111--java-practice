import java.util.Scanner;
public class Computer{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入0或1");
        int a = input.nextInt();
        while(a == 1){
            System.out.println("0");
            break;
        }
        while(a == 0){
            System.out.println("1");
            break;
        }
    }
}