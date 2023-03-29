import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {
    @Test
    public void buyMore() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buyLess() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void buyExactly() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}