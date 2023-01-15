import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        String str1,str2;
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入字串");
        str1 = input.nextLine();

        if(str1.contains("world"))
            System.out.println("Hello, "+str1);
        else if(str1.contains("Hi"))
            System.out.println(str1 + " bro!");
        else if(str1.contains("Taiwan"))
            System.out.println("Wellow come to " + str1);
        else 
            System.out.println("error");
    }
}