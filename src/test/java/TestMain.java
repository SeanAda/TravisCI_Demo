import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Sebastian on 23.04.16.
 */
public class TestMain {

    @org.junit.Test
    public void testPrintHelloWorld() {

        assertEquals(Main.getHelloWorld(), "Hello World!");

    }

}
