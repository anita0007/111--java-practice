import java.util.Scanner;
public class Group{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入你的座號: ");
        int a =input.nextInt();
        int group = (a-1)/3+1;
        System.out.println(group);
    }
}