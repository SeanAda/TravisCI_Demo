/**
 * Created by Sebastian on 23.04.16.
 */

import java.util.*;

public class App {

    public App() {
        super();
    }

    /**
     *
     * @param elements
     * @return
     */
    public static int add(List<Integer> elements) {

        int result = 0;

        for (int element: elements) {
            result += element;
        }

        return result;
    }

    /**
     *
     * @param elements
     * @return
     */
    public static int sub(List<Integer> elements) {

        if(elements.size() > 0) {
            int result = elements.get(0);

            for (int i=1; i<elements.size(); i++) {
                result -= elements.get(i);
            }

            return result;
            }

        return 0;
    }

    /**
     *
     * @param elements
     * @return
     */
    public static int mult(List<Integer> elements) {

        if(elements.size() > 0) {
            int result = 1;

            for (int element : elements) {
                result *= element;
            }

            return result;
        }

        return 0;
    }
}
