import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.java.Log;

@Log
public class GetterLazyExample {
    @Getter(lazy=true) private final double[] cached = expensive();

    @SneakyThrows
    private double[] expensive() {
       Thread.sleep(3000);
       return new double[]{10.0, 10.2, 10.3};
    }

    public static void main(String[] args) {
        log.info("Lazy");
        new GetterLazyExample();
        log.info("Non Lazy");
        new GetterLazyExample().getCached();
        log.info("----");
    }
}