import java.util.Scanner;
public class Time{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入台灣現在的時間: ");
        int a = input.nextInt();
        int time = (a + 9)%24;
        System.out.println("美國現在時間為: "+time);
    }
}
            
           