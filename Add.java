import java.util.Scanner;

public class Add{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入兩個正整數: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("總和為: "+sum);
    }
}