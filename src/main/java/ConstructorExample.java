import lombok.*;

@AllArgsConstructor
public class ConstructorExample {
    private int x, y;

    @AllArgsConstructor
    private static class ClazzA {
        private int x;
        private int y;
    }


    @RequiredArgsConstructor
    private static class ClazzB {
        private int x;
        private final int y;
    }


    @RequiredArgsConstructor(staticName = "of")
    private static class ClazzC {
        @NonNull private int x;
        private int y;
    }

    public static void main(String[] args) {
        ClazzA a = new ClazzA(1,1);
        ClazzB b = new ClazzB(3);
        ClazzC c1 = new ClazzC(1);
        ClazzC c = ClazzC.of(1);
    }
}