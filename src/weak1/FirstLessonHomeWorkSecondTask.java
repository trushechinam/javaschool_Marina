package weak1;

import java.util.Scanner;

public class FirstLessonHomeWorkSecondTask {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if ( number % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");


    }
}
