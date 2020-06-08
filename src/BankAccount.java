import java.util.Scanner;
import java.util.Date;

/**
 * Bank Account class that creates an account for a user using their first name, last name, id, and
 * join date.
 */
public class BankAccount {
  int balance;
  int previousTransaction;
  String firstName;
  String lastName;
  String customerID;
  String joinDate;

  BankAccount(String firstName, String lastName, String customerID, String joinDate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.customerID = customerID;
    this.joinDate = joinDate;
  }

  String getFirstName() {
    return this.firstName;
  }

  String getLastName() {
    return this.lastName;
  }

  String getCustomerID() {
    return this.customerID;
  }

  String getJoinDate() {
    return this.joinDate;
  }

  int getBalance() {
    return this.balance;
  }

  /**
   * Method that adds the specified value to the bank account.
   *
   * @param amount the value to add to the account.
   */
  void deposit(int amount) {
    if (amount != 0) {
      balance = balance + amount;
      previousTransaction = amount;
    }
  }

  /**
   * Method that subtracts the specified value from the bank account.
   *
   * @param amount the value to subtract from the account.
   */
  void withdraw(int amount) {
    if (amount != 0) {
      balance = balance - amount;
      previousTransaction = -amount;
    }
  }

  /**
   * Method that will show the last transaction that occured.
   */
  void getPreviousTransaction() {
    if (previousTransaction > 0) {
      System.out.println("Last Deposit: " + previousTransaction);
    } else if (previousTransaction < 0) {
      System.out.println("Last Withdrawal: " + Math.abs(previousTransaction));
    } else {
      System.out.println("No previous transactions.");
    }
  }

  void showMenu() {
    char option = '\0';
    Scanner scanner = new Scanner(System.in);

    System.out.println("######################################");
    System.out.println("##   Welcome " + firstName + ", ");
    System.out.println("##   Account Start Date: " + joinDate);
    System.out.println("##   Account Owner: " + lastName + ", " + firstName);
    System.out.println("##   Account Number: " + customerID);
    System.out.println("######################################");

    System.out.println("\n");
    System.out.println("Please Select from the Following Menu:");
    System.out.println("A. Check Balance");
    System.out.println("B. Make a Deposit");
    System.out.println("C. Make a Withdrawal");
    System.out.println("D. See Previous Transaction");
    System.out.println("E. Finish");

    do {
      System.out.println("=====================================================================");
      System.out.println(" Please Select an Option (A, B, C, D, or E)");
      System.out.println("=====================================================================");
      option = scanner.next().charAt(0);
      System.out.println("\n");

      switch (option) {

        case 'A':
          System.out.println("----------------------------------");
          System.out.println("Current Balance = " + balance);
          System.out.println("----------------------------------");
          System.out.println("\n");
          break;

        case 'B':
          System.out.println("----------------------------------");
          System.out.println("Enter Deposit Amount: ");
          System.out.println("----------------------------------");
          int amount = scanner.nextInt();
          deposit(amount);
          System.out.println("\n");
          System.out.println("Deposit Successful.");
          System.out.println("\n");
          break;

        case 'C':
          System.out.println("----------------------------------");
          System.out.println("Enter Withdrawal Amount: ");
          System.out.println("----------------------------------");
          int withdrawAmount = scanner.nextInt();
          withdraw(withdrawAmount);
          System.out.println("\n");
          System.out.println("Withdrawal Successful.");
          System.out.println("\n");
          break;

        case 'D':
          System.out.println("----------------------------------");
          getPreviousTransaction();
          System.out.println("----------------------------------");
          System.out.println("\n");
          break;

        case 'E':
          System.out.println("----------------------------------");
          break;

        default:
          System.out.println("Invalid Selection. Please Select from the Menu (A, B, C, D, or E");
      }
    }
    while (option != 'E');
    System.out.println("Thank you for using Java Bank. Have a Great Day.");
  }

}
