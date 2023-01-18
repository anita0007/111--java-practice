import java.util.Scanner;
public class Number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入整數:");
        int a = input.nextInt();
        a = a % 2;
        if( a == 0)
            System.out.println("偶數");
        else
            System.out.println("奇數");
    }
}
        