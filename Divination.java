import java.util.Scanner;
public class Divination{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入月份: ");
        int month = input.nextInt();
        System.out.println("請輸入日期: ");
        int day = input.nextInt();
        int s = (month*2+day)%3;
        if(s == 0)
            System.out.println("今日運勢普通...");
        else if(s == 1)
            System.out.println("今日運勢吉~"); 
        else
            System.out.println("今日運勢大吉!!!");    
    }
}