//this program will calculate the remainder of X divided by Y
/*
TODO: fix program so that it properly works with 0
*/
import java.util.Scanner;
class Modulo {
   static Scanner sc = new Scanner(System.in);
   public static void main(String[] args) {
       System.out.println("Input the number to be divided:");
       int X = sc.nextInt();
       System.out.println("Now enter the number you want " + X + " to be divided by:");
       int Y = sc.nextInt();
      System.out.println(X + " % " + Y + " =  " + Math.abs(calcMod(X, Y)));
   }
   static int calcMod(int x, int y) {
     int d = 0;
     while (d*y < x) {
        d += 1;
     }
      return(x - d*y);
   }
}
