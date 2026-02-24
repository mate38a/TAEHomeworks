import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import com.homework.BankAccount;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Mateo");
    }

    @Test
    public void testInitialBalance() {
        assertEquals("Mateo", account.getOwnerName(), "El nombre del titular debería ser Mateo");
        assertEquals(0.0, account.getBalance(), 0.001, "El balance inicial debería ser 0.0");
    }

    @Test
    public void testAddMoney() {
        account.addMoney(100.0);
        assertEquals(100.0, account.getBalance(), 0.001, "El balance debería ser 100.0 tras consignar dinero");
    }

    @Test
    public void testAddNegativeMoneyDoesNotChangeBalance() {
        account.addMoney(-50.0);
        assertEquals(0.0, account.getBalance(), 0.001, "El balance no debería cambiar con cantidad negativa");
    }

    @Test
    public void testRetrieveMoney() {
        account.addMoney(100.0);
        account.retrieveMoney(50.0);
        assertEquals(50.0, account.getBalance(), 0.001, "El balance debería ser 50.0 tras retirar dinero");
    }

    @Test
    public void testRetrieveMoneyInsufficientFunds() {
        account.addMoney(50.0);
        account.retrieveMoney(100.0);
        assertEquals(50.0, account.getBalance(), 0.001,
                "El balance no debería cambiar si los fondos son insuficientes");
    }
}
