import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculation {

    @Test
    public void test()
    {
        Assert.assertEquals(3, Calculation.cal(1,1,1,4,2009));
    }
}
