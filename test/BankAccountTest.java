import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {
  private BankAccount acc1;
  private BankAccount acc2;

  @Before
  public void setUp() {
    acc1 = new BankAccount("John", "Doe", "9876543210", "6/7/2005");
    acc2 = new BankAccount("Elvis", "Presley", "1234567890", "1/1/2000");
  }

  @Test
  public void testGetFirstName() {
    assertEquals("John", acc1.getFirstName());
    assertEquals("Elvis", acc2.getFirstName());
  }

  @Test
  public void testGetLastName() {
    assertEquals("Doe", acc1.getLastName());
    assertEquals("Presley", acc2.getLastName());
  }

  @Test
  public void testGetCustomerID() {
    assertEquals("9876543210", acc1.getCustomerID());
    assertEquals("1234567890", acc2.getCustomerID());
  }

  @Test
  public void testGetJoinDate() {
    assertEquals("6/7/2005", acc1.getJoinDate());
    assertEquals("1/1/2000", acc2.getJoinDate());
  }

  @Test
  public void testGetBalance() {
    assertEquals(0, acc1.getBalance());
    assertEquals(0, acc2.getBalance());
  }

  @Test
  public void testDeposit() {
    acc1.deposit(50);
    assertEquals(50, acc1.getBalance());
  }

  @Test
  public void testWithdrawal() {
    acc1.deposit(500);
    acc1.withdraw(50);
    assertEquals(450, acc1.getBalance());
  }

}