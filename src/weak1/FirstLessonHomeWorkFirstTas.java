package weak1;

import java.util.Scanner;

public class FirstLessonHomeWorkFirstTas {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        double course = 1.23;
        System.out.print("Please enter Eur amount to convert to USD: ");
        double eur = Double.parseDouble(scanner.next());
        System.out.println("Ammount in USD is: "+ eur * course);

    }
}
