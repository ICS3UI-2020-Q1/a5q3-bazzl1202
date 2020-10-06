import java.util.Scanner;
/**
 * Asks the user for a positive integer and computes the factorial of that integer. 
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a positive integer
    System.out.println("Please enter an integer to calculate the factorial of");
    // create a variable for user input
    int integer = input.nextInt();

    // create accumulator variable
    int sum = 1;

    for(int count = integer; count >= 1; count--){
      sum = sum*count;
    }
    System.out.println(integer + "!" + " = " + sum);
  }
}
