import org.testng.Assert;
import org.testng.annotations.Test;
public class FactorialTestNG {
    @Test
    public void testComputeFactorial() {
        Assert.assertEquals(Main.factorialNumber(0), 1);
        Assert.assertEquals(Main.factorialNumber(1), 1);
        Assert.assertEquals(Main.factorialNumber(2), 2);
        Assert.assertEquals(Main.factorialNumber(3), 6);
        Assert.assertEquals(Main.factorialNumber(4), 24);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testComputeFactorialNegative() {
        Main.factorialNumber(-1);
    }
}
