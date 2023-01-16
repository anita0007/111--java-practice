import java.util.Scanner;
public class Temperature{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入華氏溫度: ");
        int temp = input.nextInt();
        System.out.printf("攝氏溫度為:"+"%.3f",(temp-32.0)*5/9); //小數點後幾位 %."x"f       
    }                                                           //括號裡頭的數字要是浮點數
}