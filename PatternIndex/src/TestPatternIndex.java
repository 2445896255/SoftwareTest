import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class TestPatternIndex {


    @Test
    public void testPatternIndex1()
    {
        //测试A1,B1,C2,D2
        //subject=software pattern=test 期待返回：-1
        assertEquals(-1,PatternIndex.patternIndex("software","test"));
    }

    @Test
    public void testPatternIndex2()
    {
        //测试A1,B2,C2,D2
        //subject=software pattern=oft 期待返回：1
        assertEquals(1,PatternIndex.patternIndex("software","oft"));
    }

    @Test
    public void testPatternIndex3()
    {
        //测试A1,B3,C2,D2
        //subject=angellgef pattern=ge 期待返回：2
        assertEquals(2,PatternIndex.patternIndex("angellgef","ge"));
    }

    @Test(expected = NullPointerException.class)
    public void testPatternIndex4()
    {
        //测试A2,B1,C2,D2
        //subject=null pattern=test 期待抛出NullPointerException异常
        PatternIndex.patternIndex(null,"test");
    }
}
