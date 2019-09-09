import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class DataExample {

    @Data
    @RequiredArgsConstructor(staticName = "of")
    private static class ClazzA {
        @NonNull private int x;
        private int y;
    }

    public static void main(String[] args) {
        ClazzA a1 = new ClazzA(1);
        ClazzA a2 = ClazzA.of(1);

        System.out.println("Equals: " + (a1.equals(a2) ? "YES" : "NO"));
    }
}