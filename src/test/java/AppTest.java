import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddMoney() {
        App.resetBalance();
        App.addMoney(500);
        assertEquals(500, App.getBalance());
    }

    @Test
    public void testSpendMoney() {
        App.resetBalance();
        App.addMoney(1000);
        App.spendMoney(300);
        assertEquals(700, App.getBalance());
    }

    @Test
    public void testSpendMoreThanBalance() {
        App.resetBalance();
        App.addMoney(200);
        App.spendMoney(500); // invalid
        assertEquals(200, App.getBalance());
    }

    @Test
    public void testNegativeAmount() {
        App.resetBalance();
        App.addMoney(-100); // invalid
        assertEquals(0, App.getBalance());
    }
}