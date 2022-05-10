import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberTest {

    @Test
    public void testFiveSevenEight(){

        assertEquals(Number.getFiveSevenEight(), 578);
    }
}
