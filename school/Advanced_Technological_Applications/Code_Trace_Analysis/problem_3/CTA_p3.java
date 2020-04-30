/*
Code Trace Analysis Problem 3
*/
import java.util.Scanner;
import java.util.ArrayList;

class CTA_p3 {
  public static void main(String args[]) {
    System.out.println("Starting program...");
    System.out.println("Enter the numbers you want to compute the average of (one number per line). Enter \"0\" once all the desired numbers have been inputted.");
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> input = new ArrayList<>();
    double newValue = 0;
    do {
            newValue = Double.valueOf(sc.next());
            input.add(newValue);
    } while (newValue != 0);

    double sum = 0;
    for (double currentInput: input) {
            sum += currentInput;
    }
    double avg = sum / (input.size() - 1);

    System.out.println("The average is " + avg);
    System.out.println("End of program.");
  }
}
