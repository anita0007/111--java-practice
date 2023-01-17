import java.util.Scanner;
public class Pancil{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入班上人數: ");
        int a = input.nextInt();
        int b = (a/12)*50;
        int c = (a%12)*5;
        System.out.printf("一共"+"%d"+"元",b+c);
    }
}
        
        