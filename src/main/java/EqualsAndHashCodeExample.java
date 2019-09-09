import lombok.EqualsAndHashCode;
import lombok.val;

import java.util.HashMap;
import java.util.UUID;

@EqualsAndHashCode
public class EqualsAndHashCodeExample {


    private String name = "ID";
    private transient String transientVar = UUID.randomUUID().toString();
    @EqualsAndHashCode.Exclude private String random = UUID.randomUUID().toString();

    public static void main(String[] args) {
        val a = new EqualsAndHashCodeExample();
        val b = new EqualsAndHashCodeExample();

        System.out.println("Equals: " + (a.equals(b) ? "YES" : "NO"));
        System.out.println("Equals HashCode: " + (a.hashCode() == b.hashCode() ? "YES" : "NO"));
    }
}