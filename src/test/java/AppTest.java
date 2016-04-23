import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Sebastian on 23.04.16.
 */
public class AppTest {

    @org.junit.Test
    public void testAdd() throws Exception {

        ArrayList<Integer> tmp = new ArrayList();
        tmp.add(3);
        tmp.add(6);
        tmp.add(5);
        tmp.add(2);
        tmp.add(8);

        assertEquals(App.add(tmp), 24);

    }

    @org.junit.Test
    public void testSub() throws Exception {

        ArrayList<Integer> tmp = new ArrayList();
        tmp.add(3);
        tmp.add(6);
        tmp.add(5);
        tmp.add(2);
        tmp.add(8);

        assertEquals(App.sub(tmp), -18);

    }

    @org.junit.Test
    public void testMult() throws Exception {

        ArrayList<Integer> tmp = new ArrayList();
        tmp.add(3);
        tmp.add(6);
        tmp.add(5);
        tmp.add(2);
        tmp.add(8);

        assertEquals(App.mult(tmp), 1440);

    }
}