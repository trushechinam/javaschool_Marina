package weak1;

import java.util.Scanner;

public class FirstLessonHomeWorkThirdTask {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        if  (Math.cbrt(number)%1==0)
            System.out.println("Entered number is cubic");
        else
            System.out.println("Entered number is not cubic");
    }

}
