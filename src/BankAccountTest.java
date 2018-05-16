import static org.junit.Assert.*;
import org.junit.*;

public class BankAccountTest {
    BankAccount first = new BankAccount();
    BankAccount second = new BankAccount();

    @Test
    public void testingBalance() {
        assertEquals(0, first.getBalance(), 0);
        assertEquals(0, second.getBalance(), 0);
        first.addMoney(100);
        assertEquals(100, first.getBalance(), 0);
    }
    @Test
    public void testingWithdraw() {
        assertEquals(0, first.getBalance(),0);
        first.addMoney(100);
        assertEquals(100, first.getBalance(), 0);
        first.withdrawMoney(20);
        assertEquals(80, first.getBalance(), 0);
    }
    @Test
    public void testinTransferMoney() {
        assertEquals(0, first.getBalance(), 0);
        assertEquals(0, second.getBalance(), 0);
        first.addMoney(100);
        assertEquals(100, first.getBalance(), 0);
        //Fee = amount/100
        assertTrue(first.transferMoneyTo(second, 75));
        //Fee = 75/100 = 0.75  25-0.75=24.25
        assertEquals(24.25, first.getBalance(), 0);
        assertEquals(75, second.getBalance(), 0);
    }

}