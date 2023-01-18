import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入成績:");
        int a = input.nextInt();
        System.out.println("請輸入成績:");
        int b = input.nextInt();
        System.out.println("請輸入成績:");
        int c = input.nextInt();
        int max = a;
        if(max < b){ 
            max = b;
        }
        if(max < c){
            max = c;
        }
        System.out.println(max);
    }
}
        