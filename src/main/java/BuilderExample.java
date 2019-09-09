import lombok.*;

import java.util.List;

public class BuilderExample {

    @Value
    @Builder
    public static class MyClass {
        @NonNull final private Integer x;
        private int y;
        private final List<String> l;
    }


    public static void main(String[] args) {

        // Be careful this will fail at runtime because x is nonNull
        MyClass mc = MyClass.builder().build();

        System.out.println(mc.toString());

    }
}
