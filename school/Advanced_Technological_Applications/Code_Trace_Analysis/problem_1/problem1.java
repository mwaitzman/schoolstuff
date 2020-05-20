import java.util.Scanner;
class problem1 {
  static Scanner sc = new Scanner(System.in);
  static int userMax, j, i;
  public static void main(String[] args) {
    userInputSeq();
    while (i != userMax) {
      if (userMax == 0 || userMax < 0) {
        System.out.println("Enter number greater than 1");
        userInputSeq();
      }
      else {
        j = i + 1;
        i = j;
        System.out.println(i);
      }
    }
    System.out.println("Number entered by user" + userMax);
  }
  static void userInputSeq() {
    userMax = sc.nextInt();
    i = 1;
    j = 0;
  }
}
