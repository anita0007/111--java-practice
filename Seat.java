import java.util.Scanner;
public class Seat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入座位號:");
        int a = input.nextInt();
        if(a <= 2500){
            System.out.println("在第一區");
            int b = a/25;
            if (b == 0)
                System.out.printf("第"+"%d"+"排",b+1);
            else
                System.out.printf("第"+"%d"+"排",b);
            int c = a%25;
            if(c == 0)
                System.out.printf("第"+"%d"+"個位子",25);    
            else
                System.out.printf("第"+"%d"+"個位子",c);   
        }
        else if(2500<a&&a<=7500){  
            System.out.println("在第二區");
            int b = (a-2500)/50;
            if (b == 0)
                System.out.printf("第"+"%d"+"排",b+1);
            else
                System.out.printf("第"+"%d"+"排",b);
            int c = a%50;
            if(c == 0)
                System.out.printf("第"+"%d"+"個位子",50);    
            else
                System.out.printf("第"+"%d"+"個位子",c);    
        }
        else if(7500<a&&a<=10000){
            System.out.println("在第三區");
            int b = (a-7500)/25;
            if (b == 0)
                System.out.printf("第"+"%d"+"排",b+1);
            else
                System.out.printf("第"+"%d"+"排",b);
            int c = a%25;
            if(c == 0)
                System.out.printf("第"+"%d"+"個位子",25);    
            else
                System.out.printf("第"+"%d"+"個位子",c);  
        }
    }
}