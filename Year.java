import java.util.Scanner;
public class Year{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入西元年份: ");
        int a = input.nextInt();
        int year = a - 1911;
        System.out.printf("為民國: "+"%d"+"年 ",year);
    }
}
         