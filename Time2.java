import java.util.Scanner;
public class Time2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("現在時間: ");
        int a = input.nextInt();
        int b = 0;
        if(25 < a){ 
            if(a< 59){
                b = 60-a+25;
                System.out.printf("還剩幾分鐘可以打:"+"%d",b);
            }
        }
        else if(0 <= a){
            if(a <= 25){
                b = 25 - a;
                System.out.printf("還剩幾分鐘可以打:"+"%d",b);   
            }
        }
        else
            System.out.println("輸入錯誤");
    }
}
        