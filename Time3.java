import java.util.Scanner;
public class Time3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("現在幾點:");
        int a = input.nextInt();
        System.out.println("現在幾分:");
        int b = input.nextInt();
        System.out.println("鬧鐘設幾點:");
        int c = input.nextInt();
        System.out.println("鬧鐘設幾分:");
        int d = input.nextInt();
        int e = 0;
        int f = 0;
        if(a>c)
          e =c+(24-a);                              
        else
            e = c-a;
        if(b>d)
            f = b+(60-d);
        else
            f = d-b;
        System.out.printf("還可以睡:"+"%d"+"分鐘"+"\n",60*e+f);
        while(a != 0){
            System.out.println("現在幾點:");
            a = input.nextInt();
        }
        while(b != 0){
            System.out.println("現在幾點:");
            b = input.nextInt();
        }
        while(c != 0){
            System.out.println("鬧鐘設幾點:");
            c = input.nextInt();
        } 
        while(d != 0){
            System.out.println("鬧鐘設幾分:");
            d = input.nextInt();
        }
    }
}
