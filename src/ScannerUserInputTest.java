import java.util.Scanner;

/**
 * Class that represents a test method to test how the scanner functionality works when it comes
 * to taking input from a user.
 */
public class ScannerUserInputTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer:");

    // Interpreting integer value from user.
    //int a = scanner.nextInt();

    // Interpreting string single characters
    char c = scanner.next().charAt(0);
    System.out.println("Value = " + c);
  }
}
