import lombok.Cleanup;

import java.io.*;

public class CleanupExample  {

    public void close() {
        System.out.println("close");
    }

    public static void main(String[] args) throws IOException {

        @Cleanup CleanupExample object = new CleanupExample();
    }
}