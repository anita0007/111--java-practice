import java.util.Scanner;
public class Time{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入台灣現在的時間: 點");
        int a = input.nextInt();
        System.out.println("請輸入台灣現在的時間: 分");
        int b = input.nextInt();
        int time = (a + 9)%24;
        System.out.printf("美國現在時間為:"+"%d" +"點"+"%d"+"分",time,b);   
    }
}
            
           