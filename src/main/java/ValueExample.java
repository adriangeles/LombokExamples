import lombok.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValueExample {

    @Value
    private static class MyValue {
        private int x;
        private int y;
    }


    @Value
    private static class MyValue2  {
        private MyValue v;
        // Be careful with mutable object inside @Value
        private List<String> l;
    }

    public static void main(String[] args) {
        MyValue v1 = new MyValue(1, 2);
        v1.getX();
        v1.getY();
        MyValue2 v2 = new MyValue2( v1, Collections.unmodifiableList(new ArrayList<>()));
        v2.getL().add("Inmutable?");

        System.out.println(v2.toString());
    }
}
