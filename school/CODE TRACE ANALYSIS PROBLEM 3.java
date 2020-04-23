class givenProblem_unmodified {
  import java.util.Scanner;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double sum, newNum, avg;
    sum = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println(newNum = sc.next());
      System.out.println(sum = sum + newNum);
    }
    avg = sum / 5;
    System.out.println("The average is " + avg);
  }
}
class givenProblem_improvedVersionByMe {
  import java.util.scanner;
  import java.util.ArrayList;
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<double> input = new ArrayList<>();
    do {
      input.add(sc.next())
    } while (sc.next() != 0);
    for (double currentInput: input) {
      sum += currentInput;
    }
    double avg = sum / (input.length - 1);
    System.out.println("The average is " + avg);
  }
}
