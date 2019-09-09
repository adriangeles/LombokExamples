import lombok.NonNull;

public class NonNullExample {
    private String name;

    public NonNullExample(@NonNull String name) {
        this.name = name;
    }



    /**
     * This function return NullPointerException
     */
    public static void main(String[] args) {
        new NonNullExample(null);
    }
}