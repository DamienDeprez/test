import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by damien on 23/04/15.
 */
public class UnitTest {

    @Test
    public void testCalculer () throws Exception
    {
        assertEquals(2,UnitTestClass.calculer(0,1));
        assertEquals(2,UnitTestClass.calculer(1,0));
        assertEquals(4,UnitTestClass.calculer(1,3));
        assertEquals(5, UnitTestClass.calculer(3, 2));
    }

    @Test
    @Ignore
    public void testCalculerError() throws Exception
    {
        assertEquals(1.0,1.1,0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Error() throws Exception
    {

        throw new IllegalArgumentException();
    }
}
