package mypackage;

import org.junit.Test;

import java.math.BigInteger;

import static org.testng.AssertJUnit.assertEquals;

public class WindmolenServiceImplTest {
    @Test
    public void geldigeInput() {
       Request req = new Request();
       req.setWindsnelheid(BigInteger.valueOf(11));
       WindmolenServiceImpl wsi = new WindmolenServiceImpl();
       Response result = wsi.calculatePower(req);
       BigInteger result2 = result.getResult();
       int actualResult = result2.intValue();
       assertEquals(2991, actualResult);
    }
}
