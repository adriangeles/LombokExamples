import lombok.SneakyThrows;

public class SneakyThrowsExample {


    public static void main(String[] args) {
        new SneakyThrowsExample().run();
    }

    // @SneakyThrows is a wrapper for Exception without this annotation
    // compilation will fail
    @SneakyThrows
    public void run() {
        throw new Exception();
    }
}
