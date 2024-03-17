import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String Message = "";
        if (number > 0)
        {
            Message = "The number is positive";
        } else if (number < 0)
        {
            Message = "The number is negative";
        }
        else
        {
            Message = "The value equals 0";
        }
        System.out.println(Message);
    }
}