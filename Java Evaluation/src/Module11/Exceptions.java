package Module11;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number i will give you double of it");

        try {
            int n = scanner.nextInt();
            doublenumber(n);
            System.out.println(n*2);
        }
        catch (Exception e){
            System.err.println("sorry! please enter a valid positive number");
        }

        finally {
            System.out.println("your arthematic operation is done bye!");
        }

    }
    public static void doublenumber(int number){
        if(number <= 0){
            throw new ArithmeticException();
        }
        else {
            System.out.println("please wait");
        }
    }
}
